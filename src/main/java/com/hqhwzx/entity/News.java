package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the news database table.
 * 
 */
@Entity
@Table(name="news")
@NamedQuery(name="New.findAll", query="SELECT n FROM News n")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String addrflage;

	private String author;

	private int cai;

	private int clicknum;

	private String column_22;

	private int columnType;

	@Lob
	private String content;

	private String diqu;

	private String filepath;

	private String image;

	private String name;

	private String publishtime;

	private String seodescription;

	private String seokeyword;

	private int shoucang;

	private String source;

	private int specialType;

	private String title;

	private String video;

	private int viewFlag;

	private int zan;

	//bi-directional many-to-one association to Discuss
	@OneToMany(mappedBy="news")
	private List<Discuss> discusses;

	//bi-directional many-to-one association to Newsort
	@ManyToOne
	@JoinColumn(name="sortId")
	private Newsort newsort;

	//bi-directional many-to-one association to Outaccount
	@ManyToOne
	@JoinColumn(name="outId")
	private Outaccount outaccount;

	public News() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddrflage() {
		return this.addrflage;
	}

	public void setAddrflage(String addrflage) {
		this.addrflage = addrflage;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCai() {
		return this.cai;
	}

	public void setCai(int cai) {
		this.cai = cai;
	}

	public int getClicknum() {
		return this.clicknum;
	}

	public void setClicknum(int clicknum) {
		this.clicknum = clicknum;
	}

	public String getColumn_22() {
		return this.column_22;
	}

	public void setColumn_22(String column_22) {
		this.column_22 = column_22;
	}

	public int getColumnType() {
		return this.columnType;
	}

	public void setColumnType(int columnType) {
		this.columnType = columnType;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDiqu() {
		return this.diqu;
	}

	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}

	public String getFilepath() {
		return this.filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishtime() {
		return this.publishtime;
	}

	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}

	public String getSeodescription() {
		return this.seodescription;
	}

	public void setSeodescription(String seodescription) {
		this.seodescription = seodescription;
	}

	public String getSeokeyword() {
		return this.seokeyword;
	}

	public void setSeokeyword(String seokeyword) {
		this.seokeyword = seokeyword;
	}

	public int getShoucang() {
		return this.shoucang;
	}

	public void setShoucang(int shoucang) {
		this.shoucang = shoucang;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getSpecialType() {
		return this.specialType;
	}

	public void setSpecialType(int specialType) {
		this.specialType = specialType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getViewFlag() {
		return this.viewFlag;
	}

	public void setViewFlag(int viewFlag) {
		this.viewFlag = viewFlag;
	}

	public int getZan() {
		return this.zan;
	}

	public void setZan(int zan) {
		this.zan = zan;
	}

	public List<Discuss> getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	public Discuss addDiscuss(Discuss discuss) {
		getDiscusses().add(discuss);
		discuss.setNews(this);

		return discuss;
	}

	public Discuss removeDiscuss(Discuss discuss) {
		getDiscusses().remove(discuss);
		discuss.setNews(null);

		return discuss;
	}

	public Newsort getNewsort() {
		return this.newsort;
	}

	public void setNewsort(Newsort newsort) {
		this.newsort = newsort;
	}

	public Outaccount getOutaccount() {
		return this.outaccount;
	}

	public void setOutaccount(Outaccount outaccount) {
		this.outaccount = outaccount;
	}

}