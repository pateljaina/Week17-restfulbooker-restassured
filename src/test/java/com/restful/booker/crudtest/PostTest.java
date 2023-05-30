package com.restful.booker.crudtest;

import com.restful.booker.model.AuthorisationPojo;
import com.restful.booker.model.BookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostTest extends TestBase {
    @Test
    public void createToken() {
        AuthorisationPojo authorisationPojo = new AuthorisationPojo();
        authorisationPojo.setUsername("admin");
        authorisationPojo.setPassword("password123");
        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(authorisationPojo)
                .post("https://restful-booker.herokuapp.com/auth");
        response.prettyPrint();
        response.then().log().all().statusCode(200);
    }

    @Test
    public void createBooking() {
        BookingPojo.BookingDates date = new BookingPojo.BookingDates();
        date.setCheckIn("2023-07-01");
        date.setCheckout("2023-07-02");
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("Jaina");
        bookingPojo.setLastName("Prime");
        bookingPojo.setTotalPrice(175);
        bookingPojo.setDepositPaid(true);
        bookingPojo.setBookingDates(date);
        bookingPojo.setAdditionalNeeds("Breakfast");
        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(bookingPojo)
                .post("https://restful-booker.herokuapp.com/booking");
        response.prettyPrint();
        response.then().log().all().statusCode(200);
    }
    }

