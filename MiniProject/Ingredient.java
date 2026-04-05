package MiniProject;

public class Ingredient {
    private String name;
    private int quantity;

    public Ingredient(String name, int quantity) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Invalid name");
        if (quantity <= 0)
            throw new IllegalArgumentException("Invalid quantity");

        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " - " + quantity;
    }
}
