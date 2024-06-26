package com.flipkart.business;

import com.flipkart.bean.GymOwner;

public class GymOwnerService {
    
    public boolean loginGymOwner(String username,String password){
        // if login details is valid
        return true;
    }

    public void registerGymOwner(String userId,String userName, String password, String email, String panNumber,String gstNumber) {
          System.out.println("Registration Done Successfully");
    }

     public void requestGymOwnerApproval(String gymOwnerId) {
        System.out.println("Approval requested");

    }
}
