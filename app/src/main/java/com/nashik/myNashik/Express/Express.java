package com.nashik.myNashik.Express;


class Express {

    private String desc;
    private String imageURL;
    private String region;
    private String title;
    private String type;

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Express(String title, String desc, String imageURL, String type, String region) {
        this.title = title;
        this.desc = desc;
        this.imageURL = imageURL;
        this.type = type;
        this.region = region;
    }
}
