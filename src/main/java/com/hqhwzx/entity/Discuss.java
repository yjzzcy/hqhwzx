package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the discuss database table.
 * 
 */
@Entity
@NamedQuery(name="Discuss.findAll", query="SELECT d FROM Discuss d")
public class Discuss implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	private String visitorName;

	//bi-directional many-to-one association to Activity
	@ManyToOne
	@JoinColumn(name="activityId")
	private Activity activity;

	//bi-directional many-to-one association to news
	@ManyToOne
	@JoinColumn(name="belongnews")
	private News news;

	//bi-directional many-to-one association to Outaccount
	@ManyToOne
	@JoinColumn(name="outId")
	private Outaccount outaccount;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uId")
	private User user;

	//bi-directional many-to-one association to Videomanager
	@ManyToOne
	@JoinColumn(name="vId")
	private Videomanager videomanager;

	public Discuss() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getVisitorName() {
		return this.visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public News getnews() {
		return this.news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public Outaccount getOutaccount() {
		return this.outaccount;
	}

	public void setOutaccount(Outaccount outaccount) {
		this.outaccount = outaccount;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Videomanager getVideomanager() {
		return this.videomanager;
	}

	public void setVideomanager(Videomanager videomanager) {
		this.videomanager = videomanager;
	}

}