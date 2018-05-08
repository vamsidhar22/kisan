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
    public String medicine;
    public String medicineuse;
    public String prevention;
    public String id;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String cropdetails, String symptoms, String soiltype, String imageURL, String town_village, String dno, String post, String mandal, String district, String state, String pincode, String medicine, String medicineuse, String prevention, String id) {
        this.cropdetails = cropdetails;
        this.symptoms = symptoms;
        this.soiltype = soiltype;
        this.imageURL = imageURL;
        this.town_village = town_village;
        this.dno = dno;
        this.post = post;
        this.mandal = mandal;
        this.district = district;
        this.state = state;
        this.pincode = pincode;
        this.medicine = medicine;
        this.medicineuse = medicineuse;
        this.prevention = prevention;
        this.id = id;
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

    public String getState() {
        return state;
    }

    public String getMedicine() {
        return medicine;
    }

    public String getMedicineuse() {
        return medicineuse;
    }

    public String getPrevention() {
        return prevention;
    }

    public String getId() {
        return id;
    }
}
