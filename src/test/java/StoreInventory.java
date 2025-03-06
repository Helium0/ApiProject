import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;


public class StoreInventory {


    @Test
    public void getStoreInventory() {

       Response response = given()
                .baseUri("https://petstore.swagger.io/v2/store/inventory")
                .get();

       response.body().prettyPrint(); // printing returned values. They are changing every request so I can`t assert them

       Assert.assertEquals(response.statusCode(), 200);

    }


}