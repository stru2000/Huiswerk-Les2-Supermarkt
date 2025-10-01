package Homework;

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
        System.out.println(this.customerName + " is nu bij de " + superMarket.getName());
    }

    public void buyItem(String productName,int amount){

        //we moeten met de getters werken vanwege private access op de variabelen
        //werkwijze van Rowan met Ojects.equals()
        if(this.superMarket == null) {
            System.out.println(this.customerName + " moet eerst een supermarkt kiezen!");
            return;
        }
        for(int i = 0; i < superMarket.getProductList().size(); i++) {
            Product product = superMarket.getProductList().get(i);

            if(product.getName().equalsIgnoreCase(productName)) {
                superMarket.buyItem(product, amount);
                return;
            }
        }
        System.out.println(superMarket.getName() + " does not sell " + productName);
    }

    //voor de aanroep in main want variabele is private
    public String getCustomerName(){return customerName;}
    public SuperMarket getSuperMarket() {return superMarket;}

}