package Homework;

public class Product {

    //aangezien we private maken, moeten we "ergens" public maken ook om buiten de closs te gebruiken
    //methode 1: maak de variabelen direct public, dan kan je product.name doen bv in buyItem in SuperMarket class
    //methode 2: laat private, voeg getName() toe onderin, dan kan je met product.getName() aanroepen in SuperMarket class (BEST PRACTICE!!!)
    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getAmount() {return amount;}
    public void setAmount(int amount) {this.amount = amount;}
}