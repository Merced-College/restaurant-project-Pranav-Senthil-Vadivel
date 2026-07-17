// Name: Pranav Senthil Vadivel
// Date: 07/16/2026
// File Name: Ingredient.java
// Description: Creating a class called ingredients to tell java all the ingredients needed for each menu item in the restaurant

//The Ingredient class represents the one ingredient used in a menu item
public class Ingredient{

    // Instance Variables: Store information about the one ingredient (name, allergen, allergen type)
    private String name;
    private boolean allergen;
    private String allergenType;

    public Ingredient()
    {

    }

    // Parameteized constructor initializes all Ingredient information
    public Ingredient(String name, boolean allergen, String allergenType)
    {
        this.name = name;
        this.allergen = allergen;
        this.allergenType = allergenType;
    }

    // Returns the ingredient name
    public String getName()
    {
        return name;
    }

    // Updates the ingredient name
    public void setName(String name)
    {
        this.name = name;
    }
    
    // Returns true if the ingredient is an Aallergen
    public boolean isAllergen()
    {
        return allergen;
    }

    // Updates whether the ingredient is an allergen
    public void setAllergen(boolean value)
    {
        this.allergen = value;
    }

    // Returns the allergen type
    public String getAllergenType()
    {
        return allergenType;
    }

    // Updates the allergen type
    public void setAllergenType(String type)
    {
        this.allergenType = type;
    }

    // Returns a formatted String describing the ingredient
    public String toString()
    {
        return "Name: " + name + "\nAllergen: " + allergen + "\nAllergen Type: " + allergenType;
    }

    
} //end of public class Ingredient