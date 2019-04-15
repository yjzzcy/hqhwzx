package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the saltrelation database table.
 * 
 */
@Entity
@NamedQuery(name="Saltrelation.findAll", query="SELECT s FROM Saltrelation s")
public class Saltrelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Adinformation
	@ManyToOne
	@JoinColumn(name="aId")
	private Adinformation adinformation;

	//bi-directional many-to-one association to Salt
	@ManyToOne
	@JoinColumn(name="sId")
	private Salt salt;

	public Saltrelation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Adinformation getAdinformation() {
		return this.adinformation;
	}

	public void setAdinformation(Adinformation adinformation) {
		this.adinformation = adinformation;
	}

	public Salt getSalt() {
		return this.salt;
	}

	public void setSalt(Salt salt) {
		this.salt = salt;
	}

}