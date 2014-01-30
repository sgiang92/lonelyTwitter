package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;
import android.test.MoreAsserts;
public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {


	public TweetSetModelTest() {
		super(LonelyTwitterActivity.class);
	}
	
	public void testCount() {
		
		Date date = new Date();
		
		TweetSetModel tweets = new TweetSetModel();
		
		assertEquals("tweets should start empty",0,tweets.countTweets());
		
		


	}
	
	public void testAddTweet(){
		
		Date date = new Date();
		
		TweetSetModel tweets = new TweetSetModel();
		
		tweets.addTweet(new NormalTweetModel("test tweet",date));
		assertEquals("after adding a tweet, count should be 1",1,tweets.countTweets());
		try{
			tweets.addTweet(new NormalTweetModel("test tweet",date));
			assertTrue("didnt catch exception",false);
			}
		catch(IllegalArgumentException e) {
			
		}
	}
	
	public void testGetTweet(){
		Date date = new Date();
		TweetSetModel tweets = new TweetSetModel();
		tweets.addTweet(new NormalTweetModel("test tweet 1",date));
		LonelyTweetModel[] list = tweets.getTweets();
		assertEquals("list not empy",1,list.length);
		tweets.addTweet(new NormalTweetModel("test tweet 2",date));
		list = tweets.getTweets();
		LonelyTweetModel[] list2 = {new NormalTweetModel("test tweet 1",date), new NormalTweetModel("test tweet 2",date)};
		MoreAsserts.assertEquals(list2, list);
		
		
	}


}
