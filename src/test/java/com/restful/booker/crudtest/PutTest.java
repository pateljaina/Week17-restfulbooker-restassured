package com.restful.booker.crudtest;

import com.restful.booker.model.UpdateBookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutTest extends TestBase {
    @Test
    public void updateCurrentBooking(){
        UpdateBookingPojo.BookingDates date = new UpdateBookingPojo.BookingDates();
        date.setCheckIn("2023-07-01");
        date.setCheckOut("2023-07-02");
        UpdateBookingPojo updateBookingPojo = new UpdateBookingPojo();
        updateBookingPojo.setFirstName("ABC");
        updateBookingPojo.setLastName("XYZ");
        updateBookingPojo.setTotalPrice(100);
        updateBookingPojo.setDepositPaid(true);
        updateBookingPojo.setBookingDates(date);
        updateBookingPojo.setAdditionalNeeds("Breakfast");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=32b5e108c29ee13")
                .pathParam("id", 1744)
                .body(updateBookingPojo)
                .when().put("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    }


