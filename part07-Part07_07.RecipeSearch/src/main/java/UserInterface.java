import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class UserInterface {
    private ArrayList<Recipe> recetat;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recetat = new ArrayList<>();
    }

    public void getRecipes(String fileToRead) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileToRead))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int time = Integer.valueOf(fileScanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                Recipe recipe = new Recipe(name, time, ingredients);
                recetat.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void Start() {
        System.out.println("File to read:");
        String input = scanner.nextLine();
        getRecipes(input);

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("\nEnter a command:");
            String komanda = scanner.nextLine();

            if (komanda.equals("stop")) {
                break;
            } else if (komanda.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : recetat) {
                    System.out.println(recipe);
                }
            } else if (komanda.equals("find name")) {
                System.out.println("Searched word:");
                String keyword = scanner.nextLine();
                findByName(keyword);
            } else if (komanda.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                findByCookingTime(time);
            } else if (komanda.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                findByIngredient(ingredient);
            }else {
                System.out.println("Not a valid command!");
            }
        }
    }

    public void findByName(String keyword) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recetat) {
            if (recipe.recipeName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByCookingTime(int time){
        for (Recipe recipe: recetat){
            if(time >= recipe.cookingTime()){
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String ingredient){
        for (Recipe recipe:recetat){
            for (String perberes: recipe.getIngredients()){
                if (perberes.toLowerCase().equals(ingredient.toLowerCase())){
                    System.out.println(recipe);
                }
            }
        }
    }
}
