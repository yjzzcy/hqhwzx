package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the newsort database table.
 * 
 */
@Entity
@NamedQuery(name="Newsort.findAll", query="SELECT n FROM Newsort n")
public class Newsort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	//bi-directional many-to-one association to New
	@OneToMany(mappedBy="newsort")
	private List<News> news;

	public Newsort() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<News> getNews() {
		return this.news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public News addNew(News news) {
		getNews().add(news);
		news.setNewsort(this);

		return news;
	}

	public News removeNew(News news) {
		getNews().remove(news);
		news.setNewsort(null);

		return news;
	}

}