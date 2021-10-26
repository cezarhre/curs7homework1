package ro.fasttrackit.curs7.homework;

public class ProductMain {
    public static void main(String[] args) {

        Product Prod1 = new Product("Portocale", 4.55, 5, "Citrice");
        Product Prod2 = new Product("Mere", 3.99, 10, "Fructe");
        Product Prod3 = new Product("Grapefruit", 6.89, 0, "Citrice");

        System.out.println("Product1: " + Prod1.getName() + " Price: " + Prod1.getPrice() + " Quantity: " + Prod1.getQuant() + " Category: " + Prod1.getCateg());
        System.out.println("Product2: " + Prod2.getName() + " Price: " + Prod2.getPrice() + " Quantity: " + Prod2.getQuant() + " Category: " + Prod2.getCateg());
        System.out.println("Product3: " + Prod3.getName() + " Price: " + Prod3.getPrice() + " Quantity: " + Prod3.getQuant() + " Category: " + Prod3.getCateg());

        System.out.println("Stock1 " + Prod1.hasStock());
        System.out.println("Category1 " + Prod1.isCategory());
        System.out.println("Stock2 " + Prod2.hasStock());
        System.out.println("Category2 " + Prod2.isCategory());
        System.out.println("Stock3 " + Prod3.hasStock());
        System.out.println("Category3 " + Prod3.isCategory());
    }
}
