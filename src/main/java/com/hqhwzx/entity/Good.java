package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the goods database table.
 * 
 */
@Entity
@Table(name="goods")
@NamedQuery(name="Good.findAll", query="SELECT g FROM Good g")
public class Good implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String desrciptiong;

	private String name;

	private double price;

	private String source;

	private int stock;

	private int type;

	@Temporal(TemporalType.TIMESTAMP)
	private Date uploadtime;

	private int viewflag;

	//bi-directional many-to-one association to Goodsattribute
	@OneToMany(mappedBy="good")
	private List<Goodsattribute> goodsattributes;

	public Good() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesrciptiong() {
		return this.desrciptiong;
	}

	public void setDesrciptiong(String desrciptiong) {
		this.desrciptiong = desrciptiong;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getUploadtime() {
		return this.uploadtime;
	}

	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}

	public int getViewflag() {
		return this.viewflag;
	}

	public void setViewflag(int viewflag) {
		this.viewflag = viewflag;
	}

	public List<Goodsattribute> getGoodsattributes() {
		return this.goodsattributes;
	}

	public void setGoodsattributes(List<Goodsattribute> goodsattributes) {
		this.goodsattributes = goodsattributes;
	}

	public Goodsattribute addGoodsattribute(Goodsattribute goodsattribute) {
		getGoodsattributes().add(goodsattribute);
		goodsattribute.setGood(this);

		return goodsattribute;
	}

	public Goodsattribute removeGoodsattribute(Goodsattribute goodsattribute) {
		getGoodsattributes().remove(goodsattribute);
		goodsattribute.setGood(null);

		return goodsattribute;
	}

}