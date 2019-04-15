package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the naarea database table.
 * 
 */
@Entity
@NamedQuery(name="Naarea.findAll", query="SELECT n FROM Naarea n")
public class Naarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String areaName;

	//bi-directional many-to-one association to Navigation
	@ManyToOne
	@JoinColumn(name="parentId")
	private Navigation navigation;

	//bi-directional many-to-one association to Nbarea
	@OneToMany(mappedBy="naarea")
	private List<Nbarea> nbareas;

	public Naarea() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Navigation getNavigation() {
		return this.navigation;
	}

	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;
	}

	public List<Nbarea> getNbareas() {
		return this.nbareas;
	}

	public void setNbareas(List<Nbarea> nbareas) {
		this.nbareas = nbareas;
	}

	public Nbarea addNbarea(Nbarea nbarea) {
		getNbareas().add(nbarea);
		nbarea.setNaarea(this);

		return nbarea;
	}

	public Nbarea removeNbarea(Nbarea nbarea) {
		getNbareas().remove(nbarea);
		nbarea.setNaarea(null);

		return nbarea;
	}

}