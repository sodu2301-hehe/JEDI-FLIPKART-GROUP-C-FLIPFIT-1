package com.flipkart.business;

import com.flipkart.bean.Slot;

public class SlotService{
    
    public void getAllSlotsByCentre(String centreID) {
        System.out.println("Print all Fipfit GYM slot details in given centre");//List
    }

    public  void getSlotByID(String slotID){
        //doubt
    }

    public void getSlotByIDAndCentreId(String slotID, String centreId){
        // doubt
    }

    public void addSlotsForGym(String gymCentreId, List<Slot> slotList){
        System.out.println("Adding all slots to Flipfit gym: " + gymCentreId);
    }

    public boolean isSlotValid(String slotID,String centreId){
        // if slot is valid
        System.out.println("Slot is valid");
        return true;
    }
}
