package com.flipkart.business;

import com.flipkart.bean.GymCentre;
import com.flipkart.bean.GymOwner;

public class AdminService {

    private List<GymOwner> pendinGymOwnerList = new ArrayList<>();
    private List<GymCentre> pendinGymCentreList = new ArrayList<>();

    public void approveGymCenter(String gymCentreId){
        System.out.println("Approved/Rejected Gym Center: ");
    
    }

    public void approveGymOwner(String gymOwnerId){
        System.out.println("Approved/Rejected owner: ");
        
    }

    public List<GymCentre> viewPendingGymCentres(){
        System.out.println("Viewing pending Gym Center Approvals: ");
        return pendinGymCentreList; // doubt
    }

    public List<GymOwner> viewPendingGymOwners(){
        System.out.println("Viewing pending Gym Owner Approvals: ");
        return pendinGymOwnerList; // doubt
    }

}
