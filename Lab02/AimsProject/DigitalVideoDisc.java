public class DVD {
    private String id;
    private String title;
    private String category;
    private float price;
    private String director;
    private int duration;

    // Constructor with title only
    public DVD(String title) {
        this.title = title;
    }

    // Constructor with title, category, and price
    public DVD(String title, String category, float price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    // Constructor with director, category, title, and price
    public DVD(String director, String category, String title, float price) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.price = price;
    }

    // Full constructor
    public DVD(String id, String title, String category, float price, String director, int duration) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
        this.director = director;
        this.duration = duration;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Method to display DVD information
    public void showInfo() {
        System.out.println("DVD Title: " + (this.title != null ? this.title : "N/A"));
        System.out.println("Category: " + (this.category != null ? this.category : "N/A"));
        System.out.println("Price: $" + this.price);
        System.out.println("Director: " + (this.director != null ? this.director : "N/A"));
        System.out.println("Duration: " + (this.duration > 0 ? this.duration + " minutes" : "N/A"));
    }

    // Check if the duration is valid
    public boolean isValidDuration() {
        return (this.duration > 0);
    }

    // Check if the title matches a given search term
    public boolean matchesTitle(String searchTerm) {
        return title.toLowerCase().contains(searchTerm.toLowerCase());
    }

    // Check if the category matches
    public boolean matchesCategory(String searchCategory) {
        return category.equalsIgnoreCase(searchCategory);
    }

    // Check if the price is within a specified range
    public boolean isWithinPriceRange(Float minPrice, Float maxPrice) {
        if (minPrice != null && price < minPrice) {
            return false;
        }
        if (maxPrice != null && price > maxPrice) {
            return false;
        }
        return true;
    }
}
