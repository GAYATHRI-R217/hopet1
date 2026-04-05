package Project;

class RecipeManager {
    private Recipe[] recipes = new Recipe[10];
    private int count = 0;

    public void addRecipe(Recipe r) {
        if (count < recipes.length) {
            recipes[count++] = r;
            System.out.println("Recipe added!");
        } else {
            System.out.println("Storage full!");
        }
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No recipes available");
            return;
        }

        for (int i = 0; i < count; i++) {
            recipes[i].displayRecipe();
            System.out.println("----------------");
        }
    }

    public Recipe search(String name) {
        for (int i = 0; i < count; i++) {
            if (recipes[i].getName().equalsIgnoreCase(name))
                return recipes[i];
        }
        return null;
    }

    public void delete(String name) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (recipes[i].getName().equalsIgnoreCase(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Recipe not found!");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            recipes[i] = recipes[i + 1];
        }

        recipes[count - 1] = null;
        count--;

        System.out.println("Deleted successfully!");
    }
}
