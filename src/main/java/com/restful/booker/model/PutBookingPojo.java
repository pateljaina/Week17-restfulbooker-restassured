package com.restful.booker.model;

public class PutBookingPojo {

    private String firstname;
    private String lastname;
    private double totalprice;
    private boolean depositpaid;
    private BookingDates bookingDates;
    private String additionalNeeds;

    public static class BookingDates {
        private String checkIn;
        private String checkOut;

        public String getCheckIn() {
            return checkIn;
        }

        public String getCheckOut() {
            return checkOut;
        }

        public void setCheckout(String checkOut) {
            this.checkOut = checkOut;
        }

        public void setCheckIn(String checkIn) {
            this.checkIn = checkIn;
        }
    }
}
