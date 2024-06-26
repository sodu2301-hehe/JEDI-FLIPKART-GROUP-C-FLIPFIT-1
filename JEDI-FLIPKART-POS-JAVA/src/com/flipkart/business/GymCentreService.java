package com.flipkart.business;

import com.flipkart.bean.GymCentre;
import com.flipkart.bean.Slot;

public class GymCentreService{

    public void getAllCentresByOwnerId(String gymOwnerId) {
        System.out.println("Print all Flipfit GYM centres of given owner"); //List
    }

    public void getCentresByCity(String city){
        System.out.println("Print all Flipfit GYM centres in given city"); //List
    }

    public void getAvailableSlotsByCentreAndDate(String centreID, Date date){
        System.out.println("Print all available Flipfit GYM slot in given centre"); //List
    }

    public void addCenter(GymCentre gymCentre) {
        //takes gymCenter details
        System.out.println("Centre added successfully");

    }

    public void requestGymCentreApproval(String gymCentreId){
        System.out.println("Approval request");
    }
}
