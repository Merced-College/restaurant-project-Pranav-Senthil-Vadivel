import java.util.ArrayList;
// Whole file created by Brendan
public class MenuItem {
    private String name;
    private String category;
    private double price;
    private int calories;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public MenuItem() {
        name = null;
        category = null;
        price = -1.0;
        calories = -1;
    }

    public MenuItem(String newName, String newCategory, double newPrice, int newCalories, ArrayList<Ingredient> newIngredients) {
        name = newName;
        category = newCategory;
        price = newPrice;
        calories = newCalories;
        ingredients.add(newIngredients);
    }

    public String getName() {return name;}
    public void setName(String newName) {name = newName;}
    public String getCategory() {return category;}
    public void setCategory(String newCategory) {category = newCategory;}
    public double getPrice() {return price;}
    public void setPrice(double newPrice) {price = newPrice;}
    public int getCalories() {return calories;}
    public void setCalories(int newCalories) {calories = newCalories;}
    public ArrayList<Ingredient> getIngredients() {return ingredients;}
    public void addIngredient(ArrayList<Ingredient> ingredient) {ingredients.add(ingredient);}
    public String toString() {
        return getClass().getName();
    }
}