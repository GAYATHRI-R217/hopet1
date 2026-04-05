package Project;

class VegRecipe extends Recipe {

    public VegRecipe(String name) {
        super(name);
    }

    public void displayRecipe() {
        System.out.println("Veg Recipe: " + getName());
        for (int i = 0; i < getCount(); i++) {
            System.out.println(getIngredients()[i]);
        }
    }
}