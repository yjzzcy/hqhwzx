package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String account;

	private String accountId;

	private String balance;

	private String email;

	private String headimage;

	private String IDcard;

	private String name;

	private String password;

	@Column(name="password_salt")
	private String passwordSalt;

	private String phone;

	private String realname;

	//bi-directional many-to-one association to Activity
	@OneToMany(mappedBy="user")
	private List<Activity> activities;

	//bi-directional many-to-one association to Activitypeople
	@OneToMany(mappedBy="user")
	private List<Activitypeople> activitypeoples;

	//bi-directional many-to-one association to Discuss
	@OneToMany(mappedBy="user")
	private List<Discuss> discusses;

	//bi-directional many-to-one association to Receivingaddress
	@OneToMany(mappedBy="user")
	private List<Receivingaddress> receivingaddresses;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBalance() {
		return this.balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadimage() {
		return this.headimage;
	}

	public void setHeadimage(String headimage) {
		this.headimage = headimage;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordSalt() {
		return this.passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public Activity addActivity(Activity activity) {
		getActivities().add(activity);
		activity.setUser(this);

		return activity;
	}

	public Activity removeActivity(Activity activity) {
		getActivities().remove(activity);
		activity.setUser(null);

		return activity;
	}

	public List<Activitypeople> getActivitypeoples() {
		return this.activitypeoples;
	}

	public void setActivitypeoples(List<Activitypeople> activitypeoples) {
		this.activitypeoples = activitypeoples;
	}

	public Activitypeople addActivitypeople(Activitypeople activitypeople) {
		getActivitypeoples().add(activitypeople);
		activitypeople.setUser(this);

		return activitypeople;
	}

	public Activitypeople removeActivitypeople(Activitypeople activitypeople) {
		getActivitypeoples().remove(activitypeople);
		activitypeople.setUser(null);

		return activitypeople;
	}

	public List<Discuss> getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	public Discuss addDiscuss(Discuss discuss) {
		getDiscusses().add(discuss);
		discuss.setUser(this);

		return discuss;
	}

	public Discuss removeDiscuss(Discuss discuss) {
		getDiscusses().remove(discuss);
		discuss.setUser(null);

		return discuss;
	}

	public List<Receivingaddress> getReceivingaddresses() {
		return this.receivingaddresses;
	}

	public void setReceivingaddresses(List<Receivingaddress> receivingaddresses) {
		this.receivingaddresses = receivingaddresses;
	}

	public Receivingaddress addReceivingaddress(Receivingaddress receivingaddress) {
		getReceivingaddresses().add(receivingaddress);
		receivingaddress.setUser(this);

		return receivingaddress;
	}

	public Receivingaddress removeReceivingaddress(Receivingaddress receivingaddress) {
		getReceivingaddresses().remove(receivingaddress);
		receivingaddress.setUser(null);

		return receivingaddress;
	}

}