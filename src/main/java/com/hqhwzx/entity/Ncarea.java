package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ncarea database table.
 * 
 */
@Entity
@NamedQuery(name="Ncarea.findAll", query="SELECT n FROM Ncarea n")
public class Ncarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String areaName;

	//bi-directional many-to-one association to Nbarea
	@ManyToOne
	@JoinColumn(name="parentId")
	private Nbarea nbarea;

	public Ncarea() {
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

	public Nbarea getNbarea() {
		return this.nbarea;
	}

	public void setNbarea(Nbarea nbarea) {
		this.nbarea = nbarea;
	}

}