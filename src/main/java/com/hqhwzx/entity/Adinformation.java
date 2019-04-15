package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the adinformation database table.
 * 
 */
@Entity
@NamedQuery(name="Adinformation.findAll", query="SELECT a FROM Adinformation a")
public class Adinformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date addTime;

	private String column_14;

	private String email;

	private String idCard;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastTime;

	private String name;

	private String phone;

	private String power;

	private String qq;

	private String remark;

	private String state;

	private String substation;

	private String type;

	private String working;

	//bi-directional many-to-one association to Saltrelation
	@OneToMany(mappedBy="adinformation")
	private List<Saltrelation> saltrelations;

	public Adinformation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getColumn_14() {
		return this.column_14;
	}

	public void setColumn_14(String column_14) {
		this.column_14 = column_14;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
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

	public String getPower() {
		return this.power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSubstation() {
		return this.substation;
	}

	public void setSubstation(String substation) {
		this.substation = substation;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWorking() {
		return this.working;
	}

	public void setWorking(String working) {
		this.working = working;
	}

	public List<Saltrelation> getSaltrelations() {
		return this.saltrelations;
	}

	public void setSaltrelations(List<Saltrelation> saltrelations) {
		this.saltrelations = saltrelations;
	}

	public Saltrelation addSaltrelation(Saltrelation saltrelation) {
		getSaltrelations().add(saltrelation);
		saltrelation.setAdinformation(this);

		return saltrelation;
	}

	public Saltrelation removeSaltrelation(Saltrelation saltrelation) {
		getSaltrelations().remove(saltrelation);
		saltrelation.setAdinformation(null);

		return saltrelation;
	}

}