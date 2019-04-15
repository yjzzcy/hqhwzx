package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the videosort database table.
 * 
 */
@Entity
@NamedQuery(name="Videosort.findAll", query="SELECT v FROM Videosort v")
public class Videosort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String column_5;

	private String columns;

	private int vedioNumber;

	private int vedioPosition;

	private String videoSortName;

	//bi-directional many-to-one association to Videomanager
	@OneToMany(mappedBy="videosort")
	private List<Videomanager> videomanagers;

	public Videosort() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColumn_5() {
		return this.column_5;
	}

	public void setColumn_5(String column_5) {
		this.column_5 = column_5;
	}

	public String getColumns() {
		return this.columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

	public int getVedioNumber() {
		return this.vedioNumber;
	}

	public void setVedioNumber(int vedioNumber) {
		this.vedioNumber = vedioNumber;
	}

	public int getVedioPosition() {
		return this.vedioPosition;
	}

	public void setVedioPosition(int vedioPosition) {
		this.vedioPosition = vedioPosition;
	}

	public String getVideoSortName() {
		return this.videoSortName;
	}

	public void setVideoSortName(String videoSortName) {
		this.videoSortName = videoSortName;
	}

	public List<Videomanager> getVideomanagers() {
		return this.videomanagers;
	}

	public void setVideomanagers(List<Videomanager> videomanagers) {
		this.videomanagers = videomanagers;
	}

	public Videomanager addVideomanager(Videomanager videomanager) {
		getVideomanagers().add(videomanager);
		videomanager.setVideosort(this);

		return videomanager;
	}

	public Videomanager removeVideomanager(Videomanager videomanager) {
		getVideomanagers().remove(videomanager);
		videomanager.setVideosort(null);

		return videomanager;
	}

}