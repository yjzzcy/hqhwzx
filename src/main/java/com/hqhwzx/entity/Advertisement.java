package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the advertisement database table.
 * 
 */
@Entity
@NamedQuery(name="Advertisement.findAll", query="SELECT a FROM Advertisement a")
public class Advertisement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String addre;

	private String content;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endtime;

	private String image;

	private int isUse;

	private String link;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date starttime;

	private String video;

	public Advertisement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddre() {
		return this.addre;
	}

	public void setAddre(String addre) {
		this.addre = addre;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getIsUse() {
		return this.isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

}