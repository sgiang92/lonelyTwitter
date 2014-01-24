package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweetModel extends AbstractLonelyTweetModel {

	public NormalTweetModel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public NormalTweetModel(String text, Date timestamp) {
		super(text, timestamp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date getTimestamp() {
		// TODO Auto-generated method stub
		return super.timestamp;
	}
	
	@Override
	public String TweetType() {
		return "Normal";
	}

}