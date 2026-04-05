package MiniProject;

public class MainApp {
    public static void main(String[] args) {

        Recipe veg = new VegRecipe("Paneer Curry");
        veg.addIngredient(new Ingredient("Paneer", 200));
        veg.addIngredient(new Ingredient("Spices", 50));

        Recipe nonVeg = new NonVegRecipe("Chicken Curry");
        nonVeg.addIngredient(new Ingredient("Chicken", 500));
        nonVeg.addIngredient(new Ingredient("Masala", 100));

        User user = new User("John");
        user.addRecipe(veg);
        user.addRecipe(nonVeg);

        user.viewRecipes();

        RecipeManager manager = new RecipeManager();
        manager.addRecipe(veg);
        manager.addRecipe(nonVeg);

        System.out.println("Search Result:");
        Recipe r = manager.search("Paneer Curry");
        if (r != null) r.displayRecipe();
        
        manager.delete("Chicken Curry");
        System.out.println("After Deletion:");
        manager.displayAll();
    }
}
