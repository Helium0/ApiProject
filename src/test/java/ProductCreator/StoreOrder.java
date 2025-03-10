package ProductCreator;
import static io.restassured.RestAssured.*;

import POJOdata.Order;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;



public class StoreOrder {


    public static Response getInventory() {

        return given()
                   .contentType(ContentType.JSON)
                    .when()
                    .get(RootUrl.storeInventory);
    }

    public static Response postOrder(Order petOrder) {

        return given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(petOrder)
                .when()
                .post(RootUrl.storeOrder);
    }

    public static Response getOrderId(int id) {

        return given()
                .pathParam("id",id)
                .contentType(ContentType.JSON)
                .when()
                .get(RootUrl.getStoreOrder);
    }

    public static Response deleteOrderId(int id) {
        return given()
                .pathParam("id", id)
                .when()
                .delete(RootUrl.deleteStoreOrder);
    }


}
