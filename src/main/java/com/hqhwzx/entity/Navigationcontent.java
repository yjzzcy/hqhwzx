package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the navigationcontent database table.
 * 
 */
@Entity
@NamedQuery(name="Navigationcontent.findAll", query="SELECT n FROM Navigationcontent n")
public class Navigationcontent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String link;

	private String picture;

	private int sort;

	//bi-directional many-to-one association to Navigation
	@ManyToOne
	@JoinColumn(name="parentId")
	private Navigation navigation;

	public Navigationcontent() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Navigation getNavigation() {
		return this.navigation;
	}

	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;
	}

}