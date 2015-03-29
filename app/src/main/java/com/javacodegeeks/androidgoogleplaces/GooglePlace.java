package com.javacodegeeks.androidgoogleplaces;

public class GooglePlace {
	private String name;

	private String category;
	private String rating;
	private String open;
    private String name1;

    private String category1;
    private String rating1;
    private String open1;

	public GooglePlace() {
		this.name1 = "";
		this.rating1 = "";
		this.open1 = "";
		this.setCategory1("");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRating() {
		return rating;
	}

	public void setOpenNow(String open) {
		this.open = open;
	}

	public String getOpenNow() {
		return open;
	}
    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public void setRating1(String rating1) {
        this.rating1 = rating1;
    }

    public String getRating1() {
        return rating1;
    }

    public void setOpenNow1(String open1) {
        this.open1 = open1;
    }

    public String getOpenNow1() {
        return open1;
    }

}
