package com.proyecto;

public class Serie implements Displayable{
	

private String title; 
private Integer numberSeasons;
private String gender;
private String creator;
private double duration;  
private boolean seen;

public Serie() {
	super();
}

public Serie(String title, Integer numberSeasons, String gender, String creator, double duration, boolean seen) {
	super();
	this.title = title;
	this.numberSeasons = numberSeasons;
	this.gender = gender;
	this.creator = creator;
	this.duration = duration;
	this.seen = seen;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Integer getNumberSeasons() {
	return numberSeasons;
}

public void setNumberSeasons(Integer numberSeasons) {
	this.numberSeasons = numberSeasons;
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

public boolean isSeen() {
	return seen;
}

public void setSeen(boolean seen) {
	this.seen = seen;
}



@Override
public String toString() {
	return "Serie [title=" + title + ", numberSeasons=" + numberSeasons + ", gender=" + gender + ", creator=" + creator
			+ ", duration=" + duration + ", seen=" + seen + "]";
}

@Override
public void watched() {
	// TODO Auto-generated method stub
	
}

@Override
public double seenTime() {
	// TODO Auto-generated method stub
	return 0;
}



	
	
	
	

}
