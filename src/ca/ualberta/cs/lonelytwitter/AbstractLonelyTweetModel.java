package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class AbstractLonelyTweetModel {
	
	private String text;
	protected Date timestamp;
	
	
	public AbstractLonelyTweetModel(String text) {
		super();
		this.text = text;
		timestamp = new Date();
		
	}
	
	public AbstractLonelyTweetModel(String text, Date timestamp) {
		super();
		this.text = text;
		this.timestamp = timestamp;
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) throws Exception {
		if(text.length() > 140){
			throw new IllegalArgumentException();
		}
		this.text = text;
	}
	
	public abstract Date getTimestamp();
	
	public abstract String TweetType();
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	


	
}