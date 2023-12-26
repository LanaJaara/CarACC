package carp;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String id;
    private String name;
    private String price;
    private String availability;
    private String categories;
    private String image;
    private boolean updated = false;
    private boolean deleted = false;
    private String date;
    private String time;
    private boolean scheduled = false;

    private static List<Product> productList = new ArrayList<>();

    public Product(String id, String name, String price, String availability, String categories, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.categories = categories;
        this.image = image;
    }

    public Product(String id, String date, String time) {
        this.id = id;
        this.date = date;
        this.time = time;
    }

    public void update(String name, String price, String availability, String categories, String image) {
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.categories = categories;
        this.image = image;
        updated = true;
    }

    public void delete() {
        deleted = true;
    }

    public boolean isUpdated() {
        return updated;
    }

    public String getId() {
        return id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public boolean hasOrders() {
        // Placeholder implementation, you need to define the ordersList and its logic
        String ordersList = null;
        return ordersList != null && ordersList.contains(this.toString());
    }

    public void addProduct(String productId, String name, String price, String availability, String categories, String image) {
        Product newProduct = new Product(productId, name, price, availability, categories, image);
        productList.add(newProduct);
        System.out.println("Product added successfully: " + newProduct);
    }

    public void updateProduct(String updateProductId, String updateName, String updatePrice, String updateAvailability,
                               String updateCategories, String updateImage) {
        for (Product product : productList) {
            if (product.getId().equals(updateProductId)) {
                product.update(updateName, updatePrice, updateAvailability, updateCategories, updateImage);
                System.out.println("Product updated successfully: " + product);
                return;
            }
        }
        System.out.println("Product not found with ID: " + updateProductId);
    }

    public void deleteProduct(String deleteProductId) {
        productList.removeIf(product -> product.getId().equals(deleteProductId));
        System.out.println("Product deleted successfully with ID: " + deleteProductId);
    }
    public void browseProducts() {
        // TODO: Add logic to browse products
        System.out.println("Browsing products");
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}