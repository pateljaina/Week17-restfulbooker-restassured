package com.restful.booker.crudtest;

import com.restful.booker.model.PatchBookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchTest extends TestBase {
    @Test
    public void updateARecordPartially() {
        PatchBookingPojo patchBookingPojo = new PatchBookingPojo();
        patchBookingPojo.setFirstname("Prime");
        patchBookingPojo.setLastname("Testing");
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=32b5e108c29ee13")
                .pathParam("id", 1744)
                .body(patchBookingPojo)
                .when().patch("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    }

