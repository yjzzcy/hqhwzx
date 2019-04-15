package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the specialsort database table.
 * 
 */
@Entity
@NamedQuery(name="Specialsort.findAll", query="SELECT s FROM Specialsort s")
public class Specialsort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int contributenum;

	private String name;

	private int reorder;

	private String seodescription;

	private String seokeyword;

	//bi-directional many-to-one association to Special
	@OneToMany(mappedBy="specialsort")
	private List<Special> specials;

	public Specialsort() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContributenum() {
		return this.contributenum;
	}

	public void setContributenum(int contributenum) {
		this.contributenum = contributenum;
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

	public String getSeodescription() {
		return this.seodescription;
	}

	public void setSeodescription(String seodescription) {
		this.seodescription = seodescription;
	}

	public String getSeokeyword() {
		return this.seokeyword;
	}

	public void setSeokeyword(String seokeyword) {
		this.seokeyword = seokeyword;
	}

	public List<Special> getSpecials() {
		return this.specials;
	}

	public void setSpecials(List<Special> specials) {
		this.specials = specials;
	}

	public Special addSpecial(Special special) {
		getSpecials().add(special);
		special.setSpecialsort(this);

		return special;
	}

	public Special removeSpecial(Special special) {
		getSpecials().remove(special);
		special.setSpecialsort(null);

		return special;
	}

}