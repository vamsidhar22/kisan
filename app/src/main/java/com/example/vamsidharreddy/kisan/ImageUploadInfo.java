package com.example.vamsidharreddy.kisan;

/**
 * Created by USER on 3/22/2018.
 */

public class ImageUploadInfo {

    public String cropdetails;
    public String symptoms;
    public String soiltype;

    public String imageURL;
    public String town_village;
    public String dno;
    public String post;
    public String mandal;
    public String district;
    public String state;
    public String pincode;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String crop, String sym,String soil ,String url,String village,String doorno,String post,String mandal,String dist,String state,String pin ) {



        this.imageURL= url;
        this.symptoms=sym;
        this.soiltype=soil;
        this.cropdetails = crop;
        this.town_village=village;
        this.dno=doorno;
        this.post=post;
        this.mandal=mandal;
        this.district=dist;
        this.state=state;
        this.pincode=pin;
    }

    public String getCropdetails() {
        return cropdetails;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getSoiltype() {
        return soiltype;
    }

    public String getTown_village() {
        return town_village;
    }

    public String getDno() {
        return dno;
    }

    public String getPost() {
        return post;
    }

    public String getMandal() {
        return mandal;
    }

    public String getDistrict() {
        return district;
    }

    public String getPincode() {
        return pincode;
    }
}
