class Product {
    private final String productCode = "P1234";  // constant field

  
    public String getProductCode() {
        return productCode;
    }
}

public class EncapsulationExample4 {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("Product Code: " + p.getProductCode());
    }
}
