package MiniProject;

class User {
    private String name;
    private Recipe[] recipes = new Recipe[10];
    private int count = 0;

    public User(String name) {
        this.name = name;
    }

    public void addRecipe(Recipe r) {
        if (count == recipes.length) {
            System.out.println("Recipe list full");
            return;
        }
        recipes[count++] = r;
    }

    public void viewRecipes() {
        for (int i = 0; i < count; i++) {
            recipes[i].displayRecipe();
            System.out.println("----------------");
        }
    }
}