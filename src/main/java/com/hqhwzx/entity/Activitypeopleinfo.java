package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activitypeopleinfo database table.
 * 
 */
@Entity
@NamedQuery(name="Activitypeopleinfo.findAll", query="SELECT a FROM Activitypeopleinfo a")
public class Activitypeopleinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int age;

	private String city;

	private String column_11;

	private String emergencyContact;

	private String emergencyContactPhone;

	private String IDcard;

	private String name;

	private String phone;

	private String relationship;

	//bi-directional many-to-one association to Activity
	@ManyToOne
	@JoinColumn(name="activityId")
	private Activity activity;

	//bi-directional many-to-one association to Activitynumber
	@ManyToOne
	@JoinColumn(name="numberId")
	private Activitynumber activitynumber;

	public Activitypeopleinfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getColumn_11() {
		return this.column_11;
	}

	public void setColumn_11(String column_11) {
		this.column_11 = column_11;
	}

	public String getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyContactPhone() {
		return this.emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public String getIDcard() {
		return this.IDcard;
	}

	public void setIDcard(String IDcard) {
		this.IDcard = IDcard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
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

}