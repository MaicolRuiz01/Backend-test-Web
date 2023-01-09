package com.proyecto.data;

public class SerieData extends Displayable {

	private Integer numberSeasons;

	public SerieData() {
		super();
	}

	public SerieData(String title, Integer numberSeasons, String gender, String creator, double duration,
			boolean viewed) {
		super(title, gender, creator, duration, viewed);
		this.numberSeasons = numberSeasons;
	}

	public Integer getNumberSeasons() {
		return numberSeasons;
	}

	public void setNumberSeasons(Integer numberSeasons) {
		this.numberSeasons = numberSeasons;
	}

	@Override
	public String toString() {
		return "Serie [title=" + title + ", numberSeasons=" + numberSeasons + ", gender=" + gender + ", creator="
				+ creator + ", duration=" + duration + ", viewed=" + viewed + "]";
	}
}
