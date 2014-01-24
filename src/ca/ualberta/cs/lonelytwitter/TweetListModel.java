package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	
		private static ArrayList<AbstractLonelyTweetModel> tweetList;
		
	
		public TweetListModel() {
			super();
			tweetList = new ArrayList<AbstractLonelyTweetModel>();
			
		}

		public ArrayList<AbstractLonelyTweetModel> getTweetList() {
			return tweetList;
		}

		public void setTweetList(ArrayList<AbstractLonelyTweetModel> tweetList) {
			this.tweetList = tweetList;
		}
		
		

}
