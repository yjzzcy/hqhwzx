package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the outaccount database table.
 * 
 */
@Entity
@NamedQuery(name="Outaccount.findAll", query="SELECT o FROM Outaccount o")
public class Outaccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String banReason;

	private String headPicture;

	private String nikeName;

	private String nPassReason;

	private String odescribe;

	private String state;

	private int type;

	//bi-directional many-to-one association to Discuss
	@OneToMany(mappedBy="outaccount")
	private List<Discuss> discusses;

	//bi-directional many-to-one association to New
	@OneToMany(mappedBy="outaccount")
	private List<News> news;

	//bi-directional many-to-one association to Videomanager
	@OneToMany(mappedBy="outaccount")
	private List<Videomanager> videomanagers;

	public Outaccount() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBanReason() {
		return this.banReason;
	}

	public void setBanReason(String banReason) {
		this.banReason = banReason;
	}

	public String getHeadPicture() {
		return this.headPicture;
	}

	public void setHeadPicture(String headPicture) {
		this.headPicture = headPicture;
	}

	public String getNikeName() {
		return this.nikeName;
	}

	public void setNikeName(String nikeName) {
		this.nikeName = nikeName;
	}

	public String getNPassReason() {
		return this.nPassReason;
	}

	public void setNPassReason(String nPassReason) {
		this.nPassReason = nPassReason;
	}

	public String getOdescribe() {
		return this.odescribe;
	}

	public void setOdescribe(String odescribe) {
		this.odescribe = odescribe;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Discuss> getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	public Discuss addDiscuss(Discuss discuss) {
		getDiscusses().add(discuss);
		discuss.setOutaccount(this);

		return discuss;
	}

	public Discuss removeDiscuss(Discuss discuss) {
		getDiscusses().remove(discuss);
		discuss.setOutaccount(null);

		return discuss;
	}

	public List<News> getNews() {
		return this.news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public News addNew(News news) {
		getNews().add(news);
		news.setOutaccount(this);

		return news;
	}

	public News removeNew(News news) {
		getNews().remove(news);
		news.setOutaccount(null);

		return news;
	}

	public List<Videomanager> getVideomanagers() {
		return this.videomanagers;
	}

	public void setVideomanagers(List<Videomanager> videomanagers) {
		this.videomanagers = videomanagers;
	}

	public Videomanager addVideomanager(Videomanager videomanager) {
		getVideomanagers().add(videomanager);
		videomanager.setOutaccount(this);

		return videomanager;
	}

	public Videomanager removeVideomanager(Videomanager videomanager) {
		getVideomanagers().remove(videomanager);
		videomanager.setOutaccount(null);

		return videomanager;
	}

}