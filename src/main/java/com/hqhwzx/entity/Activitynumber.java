package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the activitynumber database table.
 * 
 */
@Entity
@NamedQuery(name="Activitynumber.findAll", query="SELECT a FROM Activitynumber a")
public class Activitynumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String numberSort;

	//bi-directional many-to-one association to Activitypeople
	@OneToMany(mappedBy="activitynumber")
	private List<Activitypeople> activitypeoples;

	//bi-directional many-to-one association to Activitypeopleinfo
	@OneToMany(mappedBy="activitynumber")
	private List<Activitypeopleinfo> activitypeopleinfos;

	public Activitynumber() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumberSort() {
		return this.numberSort;
	}

	public void setNumberSort(String numberSort) {
		this.numberSort = numberSort;
	}

	public List<Activitypeople> getActivitypeoples() {
		return this.activitypeoples;
	}

	public void setActivitypeoples(List<Activitypeople> activitypeoples) {
		this.activitypeoples = activitypeoples;
	}

	public Activitypeople addActivitypeople(Activitypeople activitypeople) {
		getActivitypeoples().add(activitypeople);
		activitypeople.setActivitynumber(this);

		return activitypeople;
	}

	public Activitypeople removeActivitypeople(Activitypeople activitypeople) {
		getActivitypeoples().remove(activitypeople);
		activitypeople.setActivitynumber(null);

		return activitypeople;
	}

	public List<Activitypeopleinfo> getActivitypeopleinfos() {
		return this.activitypeopleinfos;
	}

	public void setActivitypeopleinfos(List<Activitypeopleinfo> activitypeopleinfos) {
		this.activitypeopleinfos = activitypeopleinfos;
	}

	public Activitypeopleinfo addActivitypeopleinfo(Activitypeopleinfo activitypeopleinfo) {
		getActivitypeopleinfos().add(activitypeopleinfo);
		activitypeopleinfo.setActivitynumber(this);

		return activitypeopleinfo;
	}

	public Activitypeopleinfo removeActivitypeopleinfo(Activitypeopleinfo activitypeopleinfo) {
		getActivitypeopleinfos().remove(activitypeopleinfo);
		activitypeopleinfo.setActivitynumber(null);

		return activitypeopleinfo;
	}

}