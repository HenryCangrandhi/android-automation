package data;

import java.util.List;

public class ProductData {

    public static List<Product> allProducts() {
        return List.of(
                new Product("Sauce Lab Back Packs"),
                new Product("Sauce Lab Bike Light"),
                new Product("Sauce Lab Bolt T-Shirt"),
                new Product("Sauce Lab Fleece Jacket"),
                new Product("Sauce Lab Onesie"),
                new Product("Test.allTheThings() T-Shirt")
        );
    }
}
