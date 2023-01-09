package com.proyecto.data;

public class MovieData extends Displayable {

	private Integer year;

	public MovieData() {
		super();
	}

	public MovieData(String title, String gender, String creator, Integer year, double duration, boolean viewed) {
		super(title, gender, creator, duration, viewed);
		this.year = year;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", gender=" + gender + ", creator=" + creator + ", year=" + year
				+ ", duration=" + duration + ", viewed=" + viewed + "]";
	}
}
