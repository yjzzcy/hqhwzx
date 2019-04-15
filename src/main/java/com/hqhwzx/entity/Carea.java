package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the carea database table.
 * 
 */
@Entity
@NamedQuery(name="Carea.findAll", query="SELECT c FROM Carea c")
public class Carea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String areaDescribe;

	private String areaName;

	private int number;

	//bi-directional many-to-one association to Carea
	@ManyToOne
	@JoinColumn(name="parentId")
	private Carea carea;

	//bi-directional many-to-one association to Carea
	@OneToMany(mappedBy="carea")
	private List<Carea> careas;

	public Carea() {
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

	public Carea getCarea() {
		return this.carea;
	}

	public void setCarea(Carea carea) {
		this.carea = carea;
	}

	public List<Carea> getCareas() {
		return this.careas;
	}

	public void setCareas(List<Carea> careas) {
		this.careas = careas;
	}

	public Carea addCarea(Carea carea) {
		getCareas().add(carea);
		carea.setCarea(this);

		return carea;
	}

	public Carea removeCarea(Carea carea) {
		getCareas().remove(carea);
		carea.setCarea(null);

		return carea;
	}

}