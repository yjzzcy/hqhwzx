package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the about database table.
 * 
 */
@Entity
@NamedQuery(name="About.findAll", query="SELECT a FROM About a")
public class About implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String column_7;

	private String column_8;

	@Lob
	private String content;

	private String name;

	private int reorder;

	private String seoDescription;

	private String seoKeyWord;

	private int viewFlag;

	public About() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColumn_7() {
		return this.column_7;
	}

	public void setColumn_7(String column_7) {
		this.column_7 = column_7;
	}

	public String getColumn_8() {
		return this.column_8;
	}

	public void setColumn_8(String column_8) {
		this.column_8 = column_8;
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

	public int getReorder() {
		return this.reorder;
	}

	public void setReorder(int reorder) {
		this.reorder = reorder;
	}

	public String getSeoDescription() {
		return this.seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public String getSeoKeyWord() {
		return this.seoKeyWord;
	}

	public void setSeoKeyWord(String seoKeyWord) {
		this.seoKeyWord = seoKeyWord;
	}

	public int getViewFlag() {
		return this.viewFlag;
	}

	public void setViewFlag(int viewFlag) {
		this.viewFlag = viewFlag;
	}

}