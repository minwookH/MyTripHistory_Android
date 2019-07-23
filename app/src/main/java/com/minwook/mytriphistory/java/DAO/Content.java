package com.minwook.mytriphistory.java.DAO;

public class Content {

    private String title;
    private String location;
    private String description;
    private double latitude;//위도
    private double longtitude;//경도
    private String startDate;
    private String endDate;

    public Content(){}

    public Content(String title, String location, String description, double latitude, double longtitude, String startDate, String endDate){
        this.title = title;
        this.location = location;
        this.description = description;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
