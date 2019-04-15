package com.hqhwzx.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the activity database table.
 * 
 */
@Entity
@NamedQuery(name="Activity.findAll", query="SELECT a FROM Activity a")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String activityType;

	private String addreass;

	private String arear;

	private int clicknum;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endtime;

	private String image;

	@Temporal(TemporalType.TIMESTAMP)
	private Date jiezhitime;

	private String money;

	private String name;

	private int peoplenummax;

	private String seodescription;

	private String seoketwords;

	private String source;

	@Temporal(TemporalType.TIMESTAMP)
	private Date starttime;

	private String video;

	private int viewflag;

	//bi-directional many-to-one association to Activitysort
	@ManyToOne
	@JoinColumn(name="sortid")
	private Activitysort activitysort;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="uId")
	private User user;

	//bi-directional many-to-one association to Activityimage
	@OneToMany(mappedBy="activity")
	private List<Activityimage> activityimages;

	//bi-directional many-to-one association to Activitypeople
	@OneToMany(mappedBy="activity")
	private List<Activitypeople> activitypeoples;

	//bi-directional many-to-one association to Activitypeopleinfo
	@OneToMany(mappedBy="activity")
	private List<Activitypeopleinfo> activitypeopleinfos;

	//bi-directional many-to-one association to Discuss
	@OneToMany(mappedBy="activity")
	private List<Discuss> discusses;

	public Activity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivityType() {
		return this.activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getAddreass() {
		return this.addreass;
	}

	public void setAddreass(String addreass) {
		this.addreass = addreass;
	}

	public String getArear() {
		return this.arear;
	}

	public void setArear(String arear) {
		this.arear = arear;
	}

	public int getClicknum() {
		return this.clicknum;
	}

	public void setClicknum(int clicknum) {
		this.clicknum = clicknum;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getJiezhitime() {
		return this.jiezhitime;
	}

	public void setJiezhitime(Date jiezhitime) {
		this.jiezhitime = jiezhitime;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeoplenummax() {
		return this.peoplenummax;
	}

	public void setPeoplenummax(int peoplenummax) {
		this.peoplenummax = peoplenummax;
	}

	public String getSeodescription() {
		return this.seodescription;
	}

	public void setSeodescription(String seodescription) {
		this.seodescription = seodescription;
	}

	public String getSeoketwords() {
		return this.seoketwords;
	}

	public void setSeoketwords(String seoketwords) {
		this.seoketwords = seoketwords;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getViewflag() {
		return this.viewflag;
	}

	public void setViewflag(int viewflag) {
		this.viewflag = viewflag;
	}

	public Activitysort getActivitysort() {
		return this.activitysort;
	}

	public void setActivitysort(Activitysort activitysort) {
		this.activitysort = activitysort;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Activityimage> getActivityimages() {
		return this.activityimages;
	}

	public void setActivityimages(List<Activityimage> activityimages) {
		this.activityimages = activityimages;
	}

	public Activityimage addActivityimage(Activityimage activityimage) {
		getActivityimages().add(activityimage);
		activityimage.setActivity(this);

		return activityimage;
	}

	public Activityimage removeActivityimage(Activityimage activityimage) {
		getActivityimages().remove(activityimage);
		activityimage.setActivity(null);

		return activityimage;
	}

	public List<Activitypeople> getActivitypeoples() {
		return this.activitypeoples;
	}

	public void setActivitypeoples(List<Activitypeople> activitypeoples) {
		this.activitypeoples = activitypeoples;
	}

	public Activitypeople addActivitypeople(Activitypeople activitypeople) {
		getActivitypeoples().add(activitypeople);
		activitypeople.setActivity(this);

		return activitypeople;
	}

	public Activitypeople removeActivitypeople(Activitypeople activitypeople) {
		getActivitypeoples().remove(activitypeople);
		activitypeople.setActivity(null);

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
		activitypeopleinfo.setActivity(this);

		return activitypeopleinfo;
	}

	public Activitypeopleinfo removeActivitypeopleinfo(Activitypeopleinfo activitypeopleinfo) {
		getActivitypeopleinfos().remove(activitypeopleinfo);
		activitypeopleinfo.setActivity(null);

		return activitypeopleinfo;
	}

	public List<Discuss> getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(List<Discuss> discusses) {
		this.discusses = discusses;
	}

	public Discuss addDiscuss(Discuss discuss) {
		getDiscusses().add(discuss);
		discuss.setActivity(this);

		return discuss;
	}

	public Discuss removeDiscuss(Discuss discuss) {
		getDiscusses().remove(discuss);
		discuss.setActivity(null);

		return discuss;
	}

}