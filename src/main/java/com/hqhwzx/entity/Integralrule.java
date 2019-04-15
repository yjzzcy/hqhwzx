package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the integralrule database table.
 * 
 */
@Entity
@NamedQuery(name="Integralrule.findAll", query="SELECT i FROM Integralrule i")
public class Integralrule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int contribute;

	private int email;

	private int identity;

	private int invite;

	private int register;

	public Integralrule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContribute() {
		return this.contribute;
	}

	public void setContribute(int contribute) {
		this.contribute = contribute;
	}

	public int getEmail() {
		return this.email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getIdentity() {
		return this.identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public int getInvite() {
		return this.invite;
	}

	public void setInvite(int invite) {
		this.invite = invite;
	}

	public int getRegister() {
		return this.register;
	}

	public void setRegister(int register) {
		this.register = register;
	}

}