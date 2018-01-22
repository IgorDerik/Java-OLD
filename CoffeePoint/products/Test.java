package CoffeePoint.products;

public class Test {

    public static void main(String[] args) {

        for (Product product : MenuList.getList()) {

            Coffee coffee = (Coffee) product;

            System.out.print(coffee.getName()+" ");
            System.out.print(coffee.getPrice()+" ");

            for (Ingredient ingredient : coffee.getIngredientList()) {
                System.out.print(ingredient.getName()+" ");
            }

            System.out.println();
        }
    /*
        Coffee americano = new Coffee(200,"Americano");

        System.out.println(americano.getName());
        System.out.println(americano.getCapacity());
        System.out.println(americano.getPrice());
        for (Ingredient ingredient : americano.getIngredientList()) {
            System.out.println(ingredient.getName());
        }
    */

    }
}
