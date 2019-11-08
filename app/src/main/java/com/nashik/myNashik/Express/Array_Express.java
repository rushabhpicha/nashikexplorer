package com.nashik.myNashik.Express;

/**
 * Created by Picha on 10/11/2017.
 */

class Array_Express {

    private String destination;
    private String source;
    private String name;
    private String number;

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getnumber() {
        return this.number;
    }

    public void setnumber(String number) {
        this.number = number;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Array_Express(String mName, String mNumber, String src, String desc) {
        this.name = mName;
        this.number = mNumber;
        this.source = src;
        this.destination = desc;
    }
}
