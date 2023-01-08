package com.proyecto;

public class Movie implements Displayable{
	
	private String title; 
	private String gender;
	private String creator;
	private Integer year;
	private double duration;  
	private boolean seen;
	
	public Movie() {
		super();
	}

	

	public Movie(String title, String gender, String creator, Integer year, double duration, boolean seen) {
		super();
		this.title = title;
		this.gender = gender;
		this.creator = creator;
		this.year = year;
		this.duration = duration;
		this.seen = seen;
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



	public Integer getYear() {
		return year;
	}



	public void setYear(Integer year) {
		this.year = year;
	}



	public double getDuration() {
		return duration;
	}



	public void setDuration(double duration) {
		this.duration = duration;
	}


	

	public void setSeen(boolean seen) {
		this.seen = seen;
	}



	@Override
	public String toString() {
		return "Movie [title=" + title + ", gender=" + gender + ", creator=" + creator + ", year=" + year
				+ ", duration=" + duration + ", seen=" + seen + "]";
	}



	@Override
	public void watched() {
		this.seen=true;
		
	}

	@Override
	public boolean isSeen() {
		// TODO Auto-generated method stub
		return seen;
		
	}

	@Override
	public double seenTime() {
		// TODO Auto-generated method stub
		return duration;
	}
	
	

}
