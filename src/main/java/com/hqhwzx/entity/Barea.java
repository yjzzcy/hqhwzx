package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the barea database table.
 * 
 */
@Entity
@NamedQuery(name="Barea.findAll", query="SELECT b FROM Barea b")
public class Barea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String areaDescribe;

	private String areaName;

	private int number;

	//bi-directional many-to-one association to Area
	@ManyToOne
	@JoinColumn(name="parentId")
	private Area area;

	public Barea() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaDescribe() {
		return this.areaDescribe;
	}

	public void setAreaDescribe(String areaDescribe) {
		this.areaDescribe = areaDescribe;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}