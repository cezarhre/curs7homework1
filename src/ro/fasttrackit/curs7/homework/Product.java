package ro.fasttrackit.curs7.homework;

public class Product {

    private String name;
    private double price;
    private int quant;
    private String categ;
    private boolean isCategory;


    public Product(String name, double price, int quant, String categ) {
        this.name = name;
        this.price = price;
        this.quant = quant;
        this.categ = categ;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }

    public String getCateg() {
        return categ;
    }

    public boolean hasStock() {
        if (quant > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isCategory() {
        String param = "Citrice";
        if (categ.equals(param)) {
            return true;
        } else {
            return false;
        }
    }
}
