package core;

public class Test {
    public static void main(String[] args) {
        QueryBuilder builder = new QueryBuilder();
        builder.bool().mustMatch("item", "Milk").mustMatch("item_type", "Dairy");
        builder.bool().shouldMatch("product_location", "New Mexico").shouldMatch("warehouse_number", 37);
        builder.bool().shouldMatch("lot_number", 307).bool().mustMatch("expiry_date", "Jan 2020");
        builder.convertToJSON();
    }
}
