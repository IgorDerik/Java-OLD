package CoffeePoint.products;

public class Coffee extends Drink {

    public Coffee(String name, int capacity) {

        /*
        Base coffee components
        Depending on capacity, ingredient ratios will change
        and we can get different coffee types
         */

        setName(name);
        setCapacity(capacity);
        addIngredient(IngredientList.water);
        addIngredient(IngredientList.coffee);

    }
}
