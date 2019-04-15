package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notice database table.
 * 
 */
@Entity
@NamedQuery(name="Notice.findAll", query="SELECT n FROM Notice n")
public class Notice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int belongId;

	private String content;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	public Notice() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBelongId() {
		return this.belongId;
	}

	public void setBelongId(int belongId) {
		this.belongId = belongId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}