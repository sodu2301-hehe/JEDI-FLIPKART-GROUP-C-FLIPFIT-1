package com.flipkart.business;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.GymCentre;
import com.flipkart.bean.Slot;

public class CustomerService {

    public void getAllGymCenterDetailsByCity(String city){
        System.out.println("Print all Flipfit GYM centres in given city"); //List
    }

    public void getAvailableSlots(String centreID, Date date){
        System.out.println("Print all available Flipfit GYM slots"); // List
    }

    public void getCustomerBookings(String customerId){
        System.out.println("Print all bookings done by the customer"); //List
        
    }


    public boolean bookSlot(String userName,Date date, String slotId,String centreId){
        // if slot is valid and no existing booking
        System.out.println("Booking Done");
        return true;
    }



    public void cancelBookingbyID(String bookingID){
        //cancel a booking
        System.out.println("Booking Canceled");
    }

    public void registerCustomer(String userName, String password, String email, String contactNumber, String address) {

        System.out.println("Customer is registered");
    }

    public void viewMyProfile(String userName) {
        System.out.println("Give profile details");
    }

    public boolean isUserValid(String userName, String password) {
        // checks for username 
        System.out.println("User is valid/invalid");
        return false;
    }
}
