package MiniProject;

class NonVegRecipe extends Recipe {

    public NonVegRecipe(String name) {
        super(name);
    }

    public void displayRecipe() {
        System.out.println("Non-Veg Recipe: " + getName());
        for (int i = 0; i < getCount(); i++) {
            System.out.println(getIngredients()[i]);
        }
    }
}
