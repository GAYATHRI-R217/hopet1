package Project;

abstract class Recipe {
    private String name;
    private Ingredient[] ingredients = new Ingredient[10];
    private int count = 0;

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addIngredient(Ingredient i) {
        if (count < ingredients.length)
            ingredients[count++] = i;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public int getCount() {
        return count;
    }

    public abstract void displayRecipe();
}