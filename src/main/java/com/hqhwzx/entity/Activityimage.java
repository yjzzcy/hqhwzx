package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activityimage database table.
 * 
 */
@Entity
@NamedQuery(name="Activityimage.findAll", query="SELECT a FROM Activityimage a")
public class Activityimage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String description;

	private String specialpic;

	private int viewflage;

	//bi-directional many-to-one association to Activity
	@ManyToOne
	@JoinColumn(name="belongId")
	private Activity activity;

	public Activityimage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpecialpic() {
		return this.specialpic;
	}

	public void setSpecialpic(String specialpic) {
		this.specialpic = specialpic;
	}

	public int getViewflage() {
		return this.viewflage;
	}

	public void setViewflage(int viewflage) {
		this.viewflage = viewflage;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

}