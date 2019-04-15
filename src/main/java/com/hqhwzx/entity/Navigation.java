package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the navigation database table.
 * 
 */
@Entity
@NamedQuery(name="Navigation.findAll", query="SELECT n FROM Navigation n")
public class Navigation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String navigationName;

	//bi-directional many-to-one association to Naarea
	@OneToMany(mappedBy="navigation")
	private List<Naarea> naareas;

	//bi-directional many-to-one association to Navigationcontent
	@OneToMany(mappedBy="navigation")
	private List<Navigationcontent> navigationcontents;

	public Navigation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNavigationName() {
		return this.navigationName;
	}

	public void setNavigationName(String navigationName) {
		this.navigationName = navigationName;
	}

	public List<Naarea> getNaareas() {
		return this.naareas;
	}

	public void setNaareas(List<Naarea> naareas) {
		this.naareas = naareas;
	}

	public Naarea addNaarea(Naarea naarea) {
		getNaareas().add(naarea);
		naarea.setNavigation(this);

		return naarea;
	}

	public Naarea removeNaarea(Naarea naarea) {
		getNaareas().remove(naarea);
		naarea.setNavigation(null);

		return naarea;
	}

	public List<Navigationcontent> getNavigationcontents() {
		return this.navigationcontents;
	}

	public void setNavigationcontents(List<Navigationcontent> navigationcontents) {
		this.navigationcontents = navigationcontents;
	}

	public Navigationcontent addNavigationcontent(Navigationcontent navigationcontent) {
		getNavigationcontents().add(navigationcontent);
		navigationcontent.setNavigation(this);

		return navigationcontent;
	}

	public Navigationcontent removeNavigationcontent(Navigationcontent navigationcontent) {
		getNavigationcontents().remove(navigationcontent);
		navigationcontent.setNavigation(null);

		return navigationcontent;
	}

}