package com.example.se_firebase;

public class Students {
     String id;
    String enroll;
    String name;
    String seat_accepted;
    public  Students(){

    }
    public Students(String id, String enroll,String name,String seat_accepted )
    {
        this.id=id;
        this.enroll=enroll;
        this.name=name;
        this.seat_accepted=seat_accepted;
    }
    public String getId(){
        return  id;
    }
    public String getname(){
        return name;
    }
    public String getEnroll(){
        return enroll;
    }
    public String getSeat_accepted(){
        return seat_accepted;
    }

}
