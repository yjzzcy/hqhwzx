package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the integralgrade database table.
 * 
 */
@Entity
@NamedQuery(name="Integralgrade.findAll", query="SELECT i FROM Integralgrade i")
public class Integralgrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int five;

	private int fore;

	private int one;

	private int three;

	private int two;

	public Integralgrade() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFive() {
		return this.five;
	}

	public void setFive(int five) {
		this.five = five;
	}

	public int getFore() {
		return this.fore;
	}

	public void setFore(int fore) {
		this.fore = fore;
	}

	public int getOne() {
		return this.one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getThree() {
		return this.three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public int getTwo() {
		return this.two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

}