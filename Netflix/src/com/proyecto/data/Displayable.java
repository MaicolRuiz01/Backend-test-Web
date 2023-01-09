package com.proyecto.data;

public class Displayable {

	protected String title;
	protected String gender;
	protected String creator;
	protected double duration;
	protected boolean viewed;
	
	public Displayable() {
		super();
	}

	public Displayable(String title, String gender, String creator, double duration, boolean viewed) {
		super();
		this.title = title;
		this.gender = gender;
		this.creator = creator;
		this.duration = duration;
		this.viewed = viewed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public boolean isViewed() {
		return viewed;
	}

	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
}
