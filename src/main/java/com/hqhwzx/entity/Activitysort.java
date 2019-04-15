package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the activitysort database table.
 * 
 */
@Entity
@NamedQuery(name="Activitysort.findAll", query="SELECT a FROM Activitysort a")
public class Activitysort implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int contributenum;

	private String name;

	private int reorder;

	private String seodescription;

	private String seokeyword;

	//bi-directional many-to-one association to Activity
	@OneToMany(mappedBy="activitysort")
	private List<Activity> activities;

	public Activitysort() {
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

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Activity addActivity(Activity activity) {
		getActivities().add(activity);
		activity.setActivitysort(this);

		return activity;
	}

	public Activity removeActivity(Activity activity) {
		getActivities().remove(activity);
		activity.setActivitysort(null);

		return activity;
	}

}