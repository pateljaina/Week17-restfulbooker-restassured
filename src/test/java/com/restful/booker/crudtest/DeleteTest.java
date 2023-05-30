package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase {
    @Test
    public void getSingleBookingID() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=32b5e108c29ee13")
                .pathParam("id", 1744)
                .when().delete("{id}");
        response.then().statusCode(201);
        response.prettyPrint();

    }}
