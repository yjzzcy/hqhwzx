package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the special database table.
 * 
 */
@Entity
@NamedQuery(name="Special.findAll", query="SELECT s FROM Special s")
public class Special implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String addrflage;

	private String author;

	private int clicknum;

	@Lob
	private String content;

	private String diqu;

	private String image;

	private String name;

	private String publishname;

	private String publishtime;

	private String seodescription;

	private String seokeyword;

	private String source;

	private String video;

	private int viewflag;

	//bi-directional many-to-one association to Specialsort
	@ManyToOne
	@JoinColumn(name="sortId")
	private Specialsort specialsort;

	public Special() {
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

	public int getClicknum() {
		return this.clicknum;
	}

	public void setClicknum(int clicknum) {
		this.clicknum = clicknum;
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

	public String getPublishname() {
		return this.publishname;
	}

	public void setPublishname(String publishname) {
		this.publishname = publishname;
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getViewflag() {
		return this.viewflag;
	}

	public void setViewflag(int viewflag) {
		this.viewflag = viewflag;
	}

	public Specialsort getSpecialsort() {
		return this.specialsort;
	}

	public void setSpecialsort(Specialsort specialsort) {
		this.specialsort = specialsort;
	}

}