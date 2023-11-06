package Company;


import io.restassured.common.mapper.TypeRef;

import java.util.List;

import static io.restassured.RestAssured.given;

public  class CompanyApi  implements CompanyApiRepo {
    private static final String  uri = "https://x-clients-be.onrender.com";
    private static final String  path = "/company";
    private static final String  deletePath = "/company/delete/";

    public List<Company> getAll() {

        return given()
                .baseUri(uri + path)
                .header("accept", "application/json")
                .when()
                .get()
                .then()
                .extract()
                .response()
                .then()
                .extract()
                .body().as(new TypeRef<List<Company>>() {
                });
    }

    public List<Company> getAll(boolean isActive) {
        return given()
                .baseUri(uri + path)
                .header("accept", "application/json")
                .param("active", isActive)
                .when()
                .get()
                .then()
                .extract()
                .response()
                .then()
                .extract()
                .body().as(new TypeRef<List<Company>>() {
                });
    }

    public void deleteById(int id, String token) {

            given()
                    .log().ifValidationFails()
                    .baseUri(uri + deletePath + id)
                    .header("accept", "application/json")
                    .header("x-client-token", token)
                    .log().ifValidationFails()
                    .contentType("application/json")
                    .when()
                    .get()
                    .then()
                    .log().ifValidationFails()
                    .statusCode(200);

    }

}
