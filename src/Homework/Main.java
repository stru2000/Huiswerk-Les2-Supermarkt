package Homework;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {


        Product bread = new Product("bread",1.59,40);
        Product fruit = new Product("fruit",0.75,100);
        Product cheese = new Product("cheese",6.00,20);
        Product toiletPaper = new Product("toiletpaper",4.00,15);

        SuperMarket superMarket = new SuperMarket(bread,fruit,cheese,toiletPaper);
        Customer customer = new Customer("Robin");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi " + customer.getCustomerName());
        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine().trim().toLowerCase();
        //System.out.println("You choose "+productName);

        System.out.println("How many do you want to buy?");
        int productAmount = scanner.nextInt();
        scanner.nextLine();
        //System.out.println("Amount: "+productAmount);

        customer.goToSuperMarket(superMarket);
        customer.buyItem(productName,productAmount);




    }
}
