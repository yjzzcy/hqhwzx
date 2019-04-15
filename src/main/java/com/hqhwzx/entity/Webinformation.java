package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the webinformation database table.
 * 
 */
@Entity
@NamedQuery(name="Webinformation.findAll", query="SELECT w FROM Webinformation w")
public class Webinformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String HWLink;

	private String microBlogAddress;

	private String picture;

	private String servicePhone;

	private String topWords;

	private String webBottom;

	private String webDescribe;

	private String webName;

	public Webinformation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHWLink() {
		return this.HWLink;
	}

	public void setHWLink(String HWLink) {
		this.HWLink = HWLink;
	}

	public String getMicroBlogAddress() {
		return this.microBlogAddress;
	}

	public void setMicroBlogAddress(String microBlogAddress) {
		this.microBlogAddress = microBlogAddress;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getTopWords() {
		return this.topWords;
	}

	public void setTopWords(String topWords) {
		this.topWords = topWords;
	}

	public String getWebBottom() {
		return this.webBottom;
	}

	public void setWebBottom(String webBottom) {
		this.webBottom = webBottom;
	}

	public String getWebDescribe() {
		return this.webDescribe;
	}

	public void setWebDescribe(String webDescribe) {
		this.webDescribe = webDescribe;
	}

	public String getWebName() {
		return this.webName;
	}

	public void setWebName(String webName) {
		this.webName = webName;
	}

}