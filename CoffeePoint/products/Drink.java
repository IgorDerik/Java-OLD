package CoffeePoint.products;

import java.util.LinkedList;

public class Drink extends Product {

    public Drink(int capacity, LinkedList<Ingredient> ingredientList) {
        this.capacity = capacity;
        this.ingredientList = ingredientList;
    }

    public Drink(int capacity) {
        this.capacity = capacity;
    }

    public Drink() {
    }

    private int capacity; //capacity in milliliters

    private LinkedList<Ingredient> ingredientList = new LinkedList<>();

    public void addIngredient(Ingredient ingredient) {

        /*
        Every full 100 ml got 1 ingredient portion
        Default implementation, can be overridden if needed
         */

        for (int i=0; i<capacity/100; i++) {

            ingredientList.add(ingredient);

        }

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIngredientList(LinkedList<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    @Override
    public int getPrice() {

        int result = 0;

        for (Ingredient ingredient : ingredientList) {
            result += ingredient.getBasePrice();
        }

        return result;
    }

    public int getCapacity() {
        return capacity;
    }

    public LinkedList<Ingredient> getIngredientList() {
        return ingredientList;
    }
}
