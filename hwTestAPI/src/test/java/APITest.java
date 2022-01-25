import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class APITest {
    private Order order = new Order();
    private int id = new Random().nextInt(777777);
    private int petId = new Random().nextInt(777777);
    private int quantity = 7;
    private String shipDate = "202112311202";
    private Status status = Status.APPROVED;
    private boolean complete = false;

    @BeforeClass
    public void prepare() {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://213.239.217.15:9090/api/v3/")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    @BeforeMethod
    public void beforeTest() {
        order.setId(id)
                .setPetId(petId)
                .setQuantity(quantity)
                .setShipDate(shipDate)
                .setStatus(status)
                .setComplete(complete);
    }

    @Test
    public void testPostOrder() {
        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);
    }

    @Test
    public void testPostAndThenGetOrder() {
        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);

        Order actual = given()
                .when()
                .get("/store/order/" + id)
                .then()
                .statusCode(200)
                .extract().body().as(Order.class);

        Assert.assertEquals(actual.getId(), order.getId());
    }

    @Test
    public void testDeleteOrder() {
        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);

        given()
                .when()
                .delete("/store/order/" + id)
                .then()
                .statusCode(200);
    }

    @Test
    public void testDeleteAndThenGetOrder() {
        given()
                .body(order)
                .when()
                .post("/store/order")
                .then()
                .statusCode(200);

        given()
                .when()
                .delete("/store/order/" + id)
                .then()
                .statusCode(200);

        given()
                .when()
                .get("/store/order/" + id)
                .then()
                .statusCode(404);
    }

    @Test(description = "endpoint /store/inventory testing")
    public void testEndpoint() {
        //костыль из 500й ошибки на http://213.239.217.15:9090/api/v3/
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        Map<String, Integer> inventory =
                given()
                        .when()
                        .get("/store/inventory")
                        .then()
                        .extract().body().as(Map.class);

        Assert.assertTrue(inventory.containsKey("sold"), "Inventory не содержит статус sold");
    }
}
