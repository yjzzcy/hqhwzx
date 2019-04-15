package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the salt database table.
 * 
 */
@Entity
@NamedQuery(name="Salt.findAll", query="SELECT s FROM Salt s")
public class Salt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	//bi-directional many-to-one association to Saltrelation
	@OneToMany(mappedBy="salt")
	private List<Saltrelation> saltrelations;

	public Salt() {
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

	public List<Saltrelation> getSaltrelations() {
		return this.saltrelations;
	}

	public void setSaltrelations(List<Saltrelation> saltrelations) {
		this.saltrelations = saltrelations;
	}

	public Saltrelation addSaltrelation(Saltrelation saltrelation) {
		getSaltrelations().add(saltrelation);
		saltrelation.setSalt(this);

		return saltrelation;
	}

	public Saltrelation removeSaltrelation(Saltrelation saltrelation) {
		getSaltrelations().remove(saltrelation);
		saltrelation.setSalt(null);

		return saltrelation;
	}

}