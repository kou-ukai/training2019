package jp.co.cis.bbs.model;

import java.io.Serializable;

public class ResponseDTO implements Serializable{
	
	private int threadId;
	
	private String name;
	
	private String coment;

	public int getThreadId() {
		return threadId;
	}

	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}
	
}
