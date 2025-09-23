package Homework;

public class SuperMarket {

    private Product bread;
    private Product fruit;
    private Product cheese;
    private Product toiletPaper;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {
        this.bread = bread;
        this.fruit = fruit;
        this.cheese = cheese;
        this.toiletPaper = toiletPaper;
    }

    //we maken dit private aangezien het een helper is (volgens opdracht)
    //wordt dus eigenlijk enkel in deze class gebruikt
    //is void omdat we verder niks returnen
    private void buyItem (Product product, int amount){
        if (amount < product.getAmount()){
            System.out.println("You bought " + amount +" "+product.getName() + " for " + product.getPrice()*amount + " euro");
        } else {
            System.out.println("You cannot buy "+amount+" "+product.getName()+" , we only have "+product.getAmount() + " "+product.getName()+ " in stock");
        }
    }

    //zelfde als bij Customer.java om publiek te maken want was als private gezet
    public Product getBread() {return bread;}
    public Product getFruit() {return fruit;}
    public Product getCheese() {return cheese;}
    public Product getToiletPaper(){return toiletPaper;}

    public void buyBread (int amount){buyItem(this.bread, amount); }
    public void buyFruit (int amount){buyItem(this.fruit, amount); }
    public void buyCheese (int amount){buyItem(this.cheese, amount); }
    public void buyToiletPaper (int amount){buyItem(this.toiletPaper, amount);}



}

