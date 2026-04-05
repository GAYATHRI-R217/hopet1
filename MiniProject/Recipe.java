package MiniProject;
    abstract class Recipe {
    private String name;
    private Ingredient[] ingredients = new Ingredient[10];
    private int count = 0;

    public Recipe(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Invalid recipe name");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addIngredient(Ingredient i) {
        if (count == ingredients.length) {
            System.out.println("Ingredient list full");
            return;
        }
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
