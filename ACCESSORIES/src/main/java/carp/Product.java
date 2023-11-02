package carp;

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
	         String ordersList = null;
			return ordersList.contains((CharSequence) this);
	    }
	

}
