package jp.co.cis.bbs.model;

import java.io.Serializable;

public class ThreadBean implements Serializable {
	private String id;
	
	private String title;
	
	private String time;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
