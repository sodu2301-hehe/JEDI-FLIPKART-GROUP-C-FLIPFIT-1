package com.flipkart.business;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Slot;

public class BookingService{

    private final ScheduleService scheduleService  = new ScheduleService();

    private final SlotService slotService = new SlotService();

    public boolean checkBookingOverlap(String customerId, Date date, String slotId){
        //return whether the customer has already booked a slot at same timing
        Slot slot = slotService.getSlotByID(slotId);
        return bookingDAO.checkBookingOverlap(customerId,date,slot.getTime());
    }
    public void addBooking(String userId, String scheduleID) {
        // if a place is there in the given schedule
        System.out.println("Booking successfull");

    }

    public List<Booking> getBookingByCustomerId(String customerId){
        //give all the bookings done by the customer with given customerID
        System.out.println("Display all the bookings");
        return 
    }

    public void cancelBooking(String bookingID) {
        System.out.println("Booking Cancel with this booking ID");
    }
}
