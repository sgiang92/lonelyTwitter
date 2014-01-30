package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;

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
		
	}
	
	public void testGetTweet(){
		Date date = new Date();
		TweetSetModel tweets = new TweetSetModel();
		LonelyTweetModel[] list1 = {new NormalTweetModel("test tweet 1",date), 
		                            new NormalTweetModel("test tweet 2",date), new NormalTweetModel("test tweet 3",date)};
		tweets.addTweet(new NormalTweetModel("test tweet 1",date));
		tweets.addTweet(new NormalTweetModel("test tweet 2",date));
		tweets.addTweet(new NormalTweetModel("test tweet 3",date));
		LonelyTweetModel[] list2 = tweets.getTweets();
		assertEquals("both lists should be equal",list1,list2);
		
	}


}
