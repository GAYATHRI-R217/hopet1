package Project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecipeManager manager = new RecipeManager();

        while (true) {
            System.out.println("\n===== Recipe Management System =====");
            System.out.println("1. Add Recipe");
            System.out.println("2. View Recipes");
            System.out.println("3. Search Recipe");
            System.out.println("4. Delete Recipe");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Recipe Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Type (Veg/NonVeg): ");
                    String type = sc.nextLine();

                    Recipe r;
                    if (type.equalsIgnoreCase("Veg"))
                        r = new VegRecipe(name);
                    else
                        r = new NonVegRecipe(name);

                    System.out.print("Enter number of ingredients: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Ingredient name: ");
                        String ingName = sc.nextLine();

                        System.out.print("Quantity: ");
                        int qty = sc.nextInt();
                        sc.nextLine();

                        r.addIngredient(new Ingredient(ingName, qty));
                    }

                    manager.addRecipe(r);
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Enter recipe name to search: ");
                    String searchName = sc.nextLine();

                    Recipe found = manager.search(searchName);
                    if (found != null)
                        found.displayRecipe();
                    else
                        System.out.println("Not found!");
                    break;

                case 4:
                    System.out.print("Enter recipe name to delete: ");
                    String delName = sc.nextLine();
                    manager.delete(delName);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}