/*
 * Restaurant Review System
 *
 * Group Members:
 * Brandon Diaz-Perez
 * Brendan Hulse
 * Pranav Senthil Vadivel
 *
 * CPSC 39
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantReviewSystem
{
    public static void main(String[] args)
    {
        ArrayList<Restaurant> restaurants = new ArrayList<>();

        try
        {
            Scanner file = new Scanner(new File("restaurant-data.csv"));

            // Skip header row
            file.nextLine();

            while (file.hasNextLine())
            {
                String line = file.nextLine();
                //Brendan Hulse 
                if (line.equals(",,,,,,,"))
                {
                    continue;
                }

                // TODO:
                // Split the CSV line into fields.
                // Hint: There are 8 columns.

                // Restaurant
                String restaurantName = "";
                String cuisine = "";
                double rating = 0;

                // Menu Item
                String menuItemName = "";
                String category = "";
                double price = 0;
                int calories = 0;

                //Brandon 
                String[] fields = line.split(","); // split everything between commas

                retaurantName = fields[0];
                cuisine = fields[1];
                rating = Double.parseDouble(fields[2]);
                menuItemName = fields[3];
                category = fields[4];
                price = Double.parseDouble(fields[5]);
                calories = Integer.parseInt(fields[6]);
                String ingredientData = fields[7]; // complicated ingredient stuff

                // Ingredient String
                //String ingredientData = "";

                //---------------------------------------------------
                // TODO:
                // Parse the line and assign values to the variables.
                //---------------------------------------------------

                // Brendan
                boolean isTrue = true;
                for (Restaurant r : restaurants) 
                { // Checks to see whether the restaurant exists in our database already. Is true if it doesn't exist
                    if (!r.getName().equals(restaurantName) && isTrue)
                    {
                        isTrue = true;
                    }
                    else 
                    {
                        isTrue = false;
                    }
                }
                
                if (isTrue) 
                {// adds the restaurant if not already there
                    Restaurant newRestaurant = new Restaurant();
                    newRestaurant.setName(restaurantName);
                    newRestaurant.setCuisine(cuisine);
                    newRestaurant.setRating(rating);
                    restaurants.add(newRestaurant);
                }
                //---------------------------------------------------
                // TODO:
                // Search the ArrayList to determine whether this
                // restaurant already exists.
                //---------------------------------------------------

                //Restaurant restaurant = null;

                for (Restaurant r : restaurants) // adds current line's menu item into the restaurant that is defintely now on the list
                {
                    if (r.getName().equals(restaurantName))
                    {
                        MenuItem newItem = new MenuItem(menuItemName, category, price, calories); // already split the data and have parameterized the constructor
                        String[] data = ingredientData.split(";");
                        for (String a : data) 
                        {
                            String[] thisIngredient = a.split("\\|"); // vertical bar is apparently special a character so had to do special split it
                            if (thisIngredient.length == 2)
                            {
                                Ingredient newIngredient = new Ingredient(thisIngredient[0], Boolean.parseBoolean(thisIngredient[1]));
                                newItem.addIngredient(newIngredient);
                            }
                            else 
                            {
                                Ingredient newIngredient = new Ingredient(thisIngredient[0], Boolean.parseBoolean(thisIngredient[1]), thisIngredient[2]);
                                newItem.addIngredient(newIngredient);
                            }
                        }
                        r.addMenuItem(newItem); // puts everything together
                       
                       // restaurant = r;
                    }
                }
                
                

                //---------------------------------------------------
                // TODO:
                // If the restaurant does not exist,
                // create it and add it to the ArrayList.
                /*if (restaurant == null)
                {
                    restaurant = new Restaurant(restaurantName, cuisine, rating);
                    restaurants.add(restaurant);
                }
                //---------------------------------------------------

                //---------------------------------------------------
                // TODO:
                // Create the MenuItem object.
                //---------------------------------------------------

                MenuItem menuItem = null;

                //---------------------------------------------------
                // TODO:
                // Split the ingredient string using ';'
                //---------------------------------------------------

                // Example:
                // String[] ingredients = ingredientData.split(";");

                //---------------------------------------------------
                // TODO:
                // For each ingredient:
                //
                // Split using "|"
                //
                // Example:
                // String[] data = ingredient.split("\\|");
                //
                // data[0] = ingredient name
                // data[1] = allergen (true/false)
                // data[2] = allergen type
                //
                // Create an Ingredient object.
                // Add it to the MenuItem.
                //---------------------------------------------------


                //---------------------------------------------------
                // TODO:
                // Add the MenuItem to the Restaurant.
                //---------------------------------------------------
            */
            }

            file.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Could not open file.");
        }

        //-------------------------------------------------------
        // Display all restaurants
        //-------------------------------------------------------
        // Brendan

        for (Restaurant restaurant : restaurants)
        {
            System.out.println(restaurant);
            for (MenuItem menu : restaurant.getMenuItems())
            {
                System.out.println(menu);// print their whole menu below each restaurant
                for (Ingredient ingredient : menu.getIngredients())
                {
                    System.out.println(ingredient); // print every ingredient in each item below the menu item
                }
            }
            System.out.println();
        }

        //-------------------------------------------------------
        // Group Algorithms
        //-------------------------------------------------------

        averageMenuPrice(restaurants);

        highestPricedMenuItem(restaurants);

        lowestPricedMenuItem(restaurants);

        // Choose ONE challenge algorithm

        // averageCalories(restaurants);
        // searchAllergens(restaurants);
        // highestRatedRestaurant(restaurants);
        // menuItemWithMostIngredients(restaurants);
        // menuItemsUnderPrice(restaurants, 10.00);

    }


    //=========================================================
    // Group Algorithms
    //=========================================================
    // Brandon
    public static void averageMenuPrice(ArrayList<Restaurant> restaurants)
    {
        System.out.println("=== Average Menu Item Price Per Restaurant ===");

        for(Restaurant restaurant : restaurants)
        {
            double total = 0;
            int count = restuarant.getMenuItems().size();

            for(MenuItem item : restaurant.getMenuItems())
            {
                total += item.getPrice();
            }

            double average = total /count;
            System.out.printf("%s: $%.2f%n", restaurant.getName(), average);
        }

        System.out.println();
    }

    public static void highestPricedMenuItem(ArrayList<Restaurant> restaurants)
    {
        // TODO
    }

    public static void lowestPricedMenuItem(ArrayList<Restaurant> restaurants)
    {
        // TODO
    }

    //---------------------------------------------------------
    // Challenge Algorithms (Choose ONE)
    //---------------------------------------------------------

    public static void averageCalories(ArrayList<Restaurant> restaurants)
    {

    }

    public static void searchAllergens(ArrayList<Restaurant> restaurants)
    {

    }

    public static void highestRatedRestaurant(ArrayList<Restaurant> restaurants)
    {

    }

    public static void menuItemWithMostIngredients(ArrayList<Restaurant> restaurants)
    {

    }

    public static void menuItemsUnderPrice(ArrayList<Restaurant> restaurants, double price)
    {

    }

}
```
