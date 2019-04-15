package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the videomanager database table.
 * 
 */
@Entity
@NamedQuery(name="Videomanager.findAll", query="SELECT v FROM Videomanager v")
public class Videomanager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date addTime;

	private String nPassReson;

	private String pictureAddress;

	private String source;

	private String title;

	private int vedioBad;

	private int vedioGood;

	private int vedioKeep;

	private int vedioNumber;

	private String videoAddress;

	private String videoDescription;

	private String videoKeyWord;

	private int viewFlag;

	//bi-directional many-to-one association to Discuss
	@OneToMany(mappedBy="videomanager")
	private List<Discuss> discusses;

	//bi-directional many-to-one association to Outaccount
	@ManyToOne
	@JoinColumn(name="belongAccount")
	private Outaccount outaccount;

	//bi-directional many-to-one association to Videosort
	@ManyToOne
	@JoinColumn(name="belongSort")
	private Videosort videosort;

	public Videomanager() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getNPassReson() {
		return this.nPassReson;
	}

	public void setNPassReson(String nPassReson) {
		this.nPassReson = nPassReson;
	}

	public String getPictureAddress() {
		return this.pictureAddress;
	}

	public void setPictureAddress(String pictureAddress) {
		this.pictureAddress = pictureAddress;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVedioBad() {
		return this.vedioBad;
	}

	public void setVedioBad(int vedioBad) {
		this.vedioBad = vedioBad;
	}

	public int getVedioGood() {
		return this.vedioGood;
	}

	public void setVedioGood(int vedioGood) {
		this.vedioGood = vedioGood;
	}

	public int getVedioKeep() {
		return this.vedioKeep;
	}

	public void setVedioKeep(int vedioKeep) {
		this.vedioKeep = vedioKeep;
	}

	public int getVedioNumber() {
		return this.vedioNumber;
	}

	public void setVedioNumber(int vedioNumber) {
		this.vedioNumber = vedioNumber;
	}

	public String getVideoAddress() {
		return this.videoAddress;
	}

	public void setVideoAddress(String videoAddress) {
		this.videoAddress = videoAddress;
	}

	public String getVideoDescription() {
		return this.videoDescription;
	}

	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}

	public String getVideoKeyWord() {
		return this.videoKeyWord;
	}

	public void setVideoKeyWord(String videoKeyWord) {
		this.videoKeyWord = videoKeyWord;
	}

	public int getViewFlag() {
		return this.viewFlag;
	}

	public void setViewFlag(int viewFlag) {
		this.viewFlag = viewFlag;
	}

	public List<Discuss> getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	public Discuss addDiscuss(Discuss discuss) {
		getDiscusses().add(discuss);
		discuss.setVideomanager(this);

		return discuss;
	}

	public Discuss removeDiscuss(Discuss discuss) {
		getDiscusses().remove(discuss);
		discuss.setVideomanager(null);

		return discuss;
	}

	public Outaccount getOutaccount() {
		return this.outaccount;
	}

	public void setOutaccount(Outaccount outaccount) {
		this.outaccount = outaccount;
	}

	public Videosort getVideosort() {
		return this.videosort;
	}

	public void setVideosort(Videosort videosort) {
		this.videosort = videosort;
	}

}