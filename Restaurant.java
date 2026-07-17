//Created by Brandon Diaz 
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private String cuisine;
    private double rating;
    private ArrayList<MenuItem> menuItems;

    //Non-arg constructor
    public Restaurant() {
        name = "Unknown";
        cuisine = "Unknown";
        rating = 0.0;
        menuItems = new ArrayList<MenuItem>();
    }
    // Parameterized constructor 
    public Restaurant(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        menuItems = new ArrayList<MenuItem>();
    }
    //My Getters!
    public String getName() { return name; }
    public String getCuisine() { return cuisine; }
    public double getRating() {return rating; }
    public ArrayList<MenuItem> getMenuItems() {return menuItems; }

    //My Setters!!
    public void setName(String name) {this.name = name;}
    public void setCuisine(String cuisine){this.cuisine = cuisine;}
    public void setRating(String rating) {this.rating = rating;}
   
   // adding a MenuItem to this restaurant
   public void addMenuItem(MenuItem item) {
    menuItems.add(item);
   
    }

    //toString 
    @Override 
    public String toString() {
        return "Restaurant{name'" + name + "', cuisine='" + cuisine +
        "', rating=" + rating + ", menuItems=" + menuItems.size() + "}";
    }

}