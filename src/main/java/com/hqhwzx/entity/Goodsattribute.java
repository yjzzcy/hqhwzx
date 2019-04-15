package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the goodsattribute database table.
 * 
 */
@Entity
@NamedQuery(name="Goodsattribute.findAll", query="SELECT g FROM Goodsattribute g")
public class Goodsattribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String sort;

	//bi-directional many-to-one association to Good
	@ManyToOne
	@JoinColumn(name="belongId")
	private Good good;

	public Goodsattribute() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Good getGood() {
		return this.good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

}