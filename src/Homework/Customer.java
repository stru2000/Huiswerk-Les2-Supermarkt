package Homework;

import java.util.Objects;

public class Customer {



    private String customerName;
    private SuperMarket superMarket;

    //dit is een constructor, zonder supermarket per opdracht
    public Customer(String customerName) {
        this.customerName = customerName;
    }

    // aparte 'constructor' voor supermarket per opdracht
    // is eigenlijk geen constructor maar een methode
    public void goToSuperMarket(SuperMarket superMarket){
        this.superMarket = superMarket;
    }

    public void buyItem(String productName,int amount){

        //we moeten met de getters werken vanwege private access op de variabelen
        //werkwijze van Rowan met Ojects.equals()
        if(Objects.equals(productName, superMarket.getBread().getName())) {
            superMarket.buyBread(amount);
        } else if (Objects.equals(productName, superMarket.getFruit().getName())) {
            superMarket.buyFruit(amount);
        } else if (Objects.equals(productName, superMarket.getCheese().getName())) {
            superMarket.buyCheese(amount);
        } else if (Objects.equals(productName, superMarket.getToiletPaper().getName())) {
            superMarket.buyToiletPaper(amount);
        } else {
            System.out.println("Invalid product name!");
        }

    }

    //voor de aanroep in main want variabele is private
    public String getCustomerName(){return customerName;}

}