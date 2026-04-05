package MiniProject;

class RecipeManager {
    private Recipe[] recipes = new Recipe[10];
    private int count = 0;

    public void addRecipe(Recipe r) {
        if (count == recipes.length) {
            System.out.println("Storage full");
            return;
        }
        recipes[count++] = r;
    }

    public Recipe search(String name) {
        for (int i = 0; i < count; i++) {
            if (recipes[i].getName().equals(name))
                return recipes[i];
        }
        return null;
    }

    public void delete(String name) {
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (recipes[i].getName().equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Recipe not found");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            recipes[i] = recipes[i + 1];
        }
        recipes[count - 1] = null;
        count--;
        System.out.println("----------------");
        System.out.println("Deleted successfully");
        System.out.println("----------------");
    }
public void displayAll() {
    for (int i = 0; i < count; i++) {
        recipes[i].displayRecipe();
        System.out.println("----------------");
    }
}
}

