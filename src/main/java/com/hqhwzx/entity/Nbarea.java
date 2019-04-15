package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the nbarea database table.
 * 
 */
@Entity
@NamedQuery(name="Nbarea.findAll", query="SELECT n FROM Nbarea n")
public class Nbarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String areaName;

	//bi-directional many-to-one association to Naarea
	@ManyToOne
	@JoinColumn(name="parentId")
	private Naarea naarea;

	//bi-directional many-to-one association to Ncarea
	@OneToMany(mappedBy="nbarea")
	private List<Ncarea> ncareas;

	public Nbarea() {
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

	public Naarea getNaarea() {
		return this.naarea;
	}

	public void setNaarea(Naarea naarea) {
		this.naarea = naarea;
	}

	public List<Ncarea> getNcareas() {
		return this.ncareas;
	}

	public void setNcareas(List<Ncarea> ncareas) {
		this.ncareas = ncareas;
	}

	public Ncarea addNcarea(Ncarea ncarea) {
		getNcareas().add(ncarea);
		ncarea.setNbarea(this);

		return ncarea;
	}

	public Ncarea removeNcarea(Ncarea ncarea) {
		getNcareas().remove(ncarea);
		ncarea.setNbarea(null);

		return ncarea;
	}

}