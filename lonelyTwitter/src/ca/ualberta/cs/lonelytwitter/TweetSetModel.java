package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetSetModel {
	
	private ArrayList<LonelyTweetModel> tweets;
	
	
	public TweetSetModel() {
		super();
		tweets = new ArrayList<LonelyTweetModel>();
	}


	public int countTweets() {
		// TODO Auto-generated method stub
		return tweets.size();
	}
	

	public void addTweet(LonelyTweetModel tweetModel) {
		tweets.add(tweetModel);
	}
	

	public LonelyTweetModel[] getTweets() {
		
		return tweets.toArray(new LonelyTweetModel[tweets.size()]);
		
	}

}
