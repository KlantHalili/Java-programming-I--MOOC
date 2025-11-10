
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal){
        if (!(meals.contains(meal))){
            meals.add(meal);
        }
    }
    
    public void printMeals(){
        for (String meal: this.meals){
            System.out.println(meal);
        }
    }
    
    public void clearMenu(){
        for (int i = meals.size() - 1; i >= 0; i--) {
    meals.remove(i);
}
    }

    // implement the required methods here
}
