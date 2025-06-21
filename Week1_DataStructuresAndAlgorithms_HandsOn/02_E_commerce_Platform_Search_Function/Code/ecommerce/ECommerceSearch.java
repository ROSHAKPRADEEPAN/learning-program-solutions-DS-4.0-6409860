package ecommerce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return productId + " | " + productName + " | " + category;
    }
}
public class ECommerceSearch {

    public static Product linearSearch(Product[] products, String key) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(key)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String key) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(key);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Table", "Furniture"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Monitor", "Electronics")
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name to search: ");
        String key = sc.nextLine();

        // Linear Search
        System.out.println("\n Linear Search Result:");
        Product foundLinear = linearSearch(products, key);
        System.out.println(foundLinear != null ? foundLinear : "Product not found.");

        // Binary Search
        System.out.println("\n Binary Search Result:");
        Product foundBinary = binarySearch(products, key);
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");

        sc.close();
    }
}
