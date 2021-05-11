package com.company;

public class Pyramid {
    String pharaoh;
    String modernName;
    String site;
    double height;

    public Pyramid(String pharaoh, String modernName, String site, double height){
        this.pharaoh = pharaoh;
        this.modernName = modernName;
        this.site = site;
        this.height = height;
    }

    //Getters
    public String getPharaoh(){
        return this.pharaoh;
    }

    public String getModernName(){
        return this.modernName;
    }

    public String getSite(){
        return this.site;
    }

    public double getHeight()
    {
        return this.height;
    }

    //Setters
    public void setPharaoh(String pharaoh){
        this.pharaoh = pharaoh;
    }

    public void setModernName(String modernName){
        this.modernName = modernName;
    }

    public void setSite(String site){
        this.site = site;
    }

    public  void setHeight(double height){
        this.height = height;
    }

    public String toString(){
        return this.pharaoh +  "," + this.modernName + "," + this.site + "," + Double.toString(this.height);
    }
}
