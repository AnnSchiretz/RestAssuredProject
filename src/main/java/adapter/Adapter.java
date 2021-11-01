package adapter;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.TendersObject;
import org.apache.http.protocol.HTTP;

import static io.restassured.RestAssured.given;


public class Adapter extends MainAdapter{

    public TendersObject getTender(String url){

        Response response =
                given()
                        .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                        .log().all()
                        .when()
                        .get(url)
                        .then()
                        .log().all()
                        .statusCode(200)
                        .contentType(ContentType.JSON).extract().response();

        return gson.fromJson(response.asString().trim(),
                             TendersObject.class);

    }
}

