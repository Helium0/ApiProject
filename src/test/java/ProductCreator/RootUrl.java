package ProductCreator;

public class RootUrl {

    public static String baseUrl = "https://petstore.swagger.io/v2";

    public static String storeInventory = baseUrl+ "/store/inventory";

    public static String storeOrder = baseUrl + "/store/order";

    public static String getStoreOrder = storeOrder + "/{id}";

    public static String deleteStoreOrder = getStoreOrder;

}
