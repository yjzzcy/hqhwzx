package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the area database table.
 * 
 */
@Entity
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String areaDescribe;

	private String areaName;

	private int number;

	//bi-directional many-to-one association to Barea
	@OneToMany(mappedBy="area")
	private List<Barea> bareas;

	public Area() {
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

	public List<Barea> getBareas() {
		return this.bareas;
	}

	public void setBareas(List<Barea> bareas) {
		this.bareas = bareas;
	}

	public Barea addBarea(Barea barea) {
		getBareas().add(barea);
		barea.setArea(this);

		return barea;
	}

	public Barea removeBarea(Barea barea) {
		getBareas().remove(barea);
		barea.setArea(null);

		return barea;
	}

}