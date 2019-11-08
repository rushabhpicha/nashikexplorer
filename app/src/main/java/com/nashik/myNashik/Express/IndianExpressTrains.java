package com.nashik.myNashik.Express;

/**
 * Created by Picha on 10/17/2017.
 */

public class IndianExpressTrains {
    private int date_plus;
    private String fri;
    private String mon;
    private String sat;
    private String sun;
    private String thu;
    private String time;
    private String trainName;
    private String trainNumber;
    private String tue;
    private String wed;

    public int getDate_plus() {
        return this.date_plus;
    }

    public void setDate_plus(int date_plus) {
        this.date_plus = date_plus;
    }

    public String getTrainName() {
        return this.trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainNumber() {
        return this.trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSun() {
        return this.sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public String getMon() {
        return this.mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getTue() {
        return this.tue;
    }

    public void setTue(String tue) {
        this.tue = tue;
    }

    public String getWed() {
        return this.wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getThu() {
        return this.thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getFri() {
        return this.fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public String getSat() {
        return this.sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public IndianExpressTrains(String mName, String mNumber, String time, String sun, String mon, String tue, String wed, String thu, String fri, String sat, int date_plus) {
        this.trainName = mName;
        this.trainNumber = mNumber;
        this.time = time;
        this.sun = sun;
        this.mon = mon;
        this.tue = tue;
        this.wed = wed;
        this.thu = thu;
        this.fri = fri;
        this.sat = sat;
        this.date_plus = date_plus;
    }

}
