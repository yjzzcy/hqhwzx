package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activitypeople database table.
 * 
 */
@Entity
@NamedQuery(name="Activitypeople.findAll", query="SELECT a FROM Activitypeople a")
public class Activitypeople implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Activity
	@ManyToOne
	@JoinColumn(name="activityId")
	private Activity activity;

	//bi-directional many-to-one association to Activitynumber
	@ManyToOne
	@JoinColumn(name="numberId")
	private Activitynumber activitynumber;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	public Activitypeople() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Activitynumber getActivitynumber() {
		return this.activitynumber;
	}

	public void setActivitynumber(Activitynumber activitynumber) {
		this.activitynumber = activitynumber;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}