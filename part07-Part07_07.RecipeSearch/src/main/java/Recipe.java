import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String recipeName(){
        return this.name;
    }
    
    public int cookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    @Override
public String toString() {
    return name + ", cooking time: " + cookingTime;
}


    // Optional: getters or toString() for display
}
