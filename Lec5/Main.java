package Lec5;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Igor");

        Movie matrix = new Movie("Matrix", new RegularPrice());

        Rental rental = new Rental(matrix, 3);

        customer.addRental(rental);

        System.out.println(customer.statement());
    }

}
