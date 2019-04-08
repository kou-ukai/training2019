package jp.co.cis.bbs.model;

import java.io.Serializable;

public class ResponseBean implements Serializable{

	private String r_coment;
	private String r_name;
	private int r_id;
	private int t_id;

	public String getR_coment() {
		return r_coment;
	}

	public void setR_coment(String r_coment) {
		this.r_coment = r_coment;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

}
