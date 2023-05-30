package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetTest extends TestBase {

    @Test
    public void getAllBookingIDs() {
        Response response = given()
                .when().get();
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getBookingsWithFirstName(){

    }

    @Test
    public void getBooking(){
        Response response = given()
                .pathParam("id", 704)
                .when().get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
