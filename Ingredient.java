public class Ingredient{

    private String name;
    private boolean allergen;
    private String allergenType;

    public Ingredient()
    {

    }

    public Ingredient(String name, boolean allergen, String allergenType)
    {
        this.name = name;
        this.allergen = allergen;
        this.allergenType = allergenType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public boolean isAllergen()
    {
        return allergen;
    }
    public void setAllergen(boolean value)
    {
        this.allergen = value;
    }

    
}