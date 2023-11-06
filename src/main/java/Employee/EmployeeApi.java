package Employee;

import io.restassured.common.mapper.TypeRef;

import java.util.List;

import static io.restassured.RestAssured.given;

public class EmployeeApi  implements EmployeeApiRepo{
    private static final String path = "/employee";
    private static final String  uri = "https://x-clients-be.onrender.com";
    public List<Employee> getAll(int companyId) {
        return given()
                .baseUri(uri + path)
                .header("accept", "application/json")
                .param("company", companyId)
                .when()
                .get()
                .then()
                .log().ifValidationFails()
                .extract()
                .response()
                .then()
                .extract().body().as(new TypeRef<List<Employee>>() {
                });
    }

    public Employee getById(int id) {
        return given()
                .baseUri(uri + path + "/" + id)
                .header("accept", "application/json")
                .when()
                .get()
                .then()
                .log().ifValidationFails()
                .statusCode(200)
                .extract().body().as(Employee.class);
    }

    public int create(Employee employee, String token) {
        return given()
                .baseUri(uri + path)
                .log().ifValidationFails()
                .header("accept", "application/json")
                .contentType("application/json; charset=utf-8")
                .header("x-client-token", token)
                .body(employee)
                .when()
                .post()
                .then()
                .log().ifValidationFails()
                .statusCode(201)
                .contentType("application/json; charset=utf-8")
                .extract().path("id");
    }

    public Employee update(Employee employee, String token) {
        return given()
                .log().ifValidationFails()
                .contentType("application/json; charset=utf-8")
                .header("x-client-token", token)
                .body(employee)
                .when()
                .patch(uri + path + "/{id}", employee.getId())
                .then().log().ifValidationFails()
                .extract()
                .body().as(Employee.class);
    }
}
