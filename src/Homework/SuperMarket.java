package Homework;
import java.util.ArrayList;
import java.util.List;

public class SuperMarket {

    private String name;
    private List<Product> productList;

    public SuperMarket(String name, List<Product> productList) {
        this.name = name;

        if (productList == null) {
            this.productList = new ArrayList<>();
        } else {
            this.productList = productList;
        }
    }

    //we maken dit private aangezien het een helper is (volgens opdracht)
    //-> moet public worden nu omdat het ook in andere klasses gebruikt wordt
    //wordt dus eigenlijk enkel in deze class gebruikt
    //is void omdat we verder niks returnen
    public void buyItem (Product product, int amount){
        if (amount <= product.getAmount()){
            int newAmount = product.getAmount() - amount;
            product.setAmount(newAmount);
            System.out.println("You bought " + amount +" "+product.getName() + " for " + String.format("%.2f", product.getPrice()*amount) + " euro");
        } else {
            System.out.println("You cannot buy "+amount+" "+product.getName()+" , we only have "+product.getAmount() + " "+product.getName()+ " in stock");
        }
    }

    public void restockItem(String productName, int amount) {
        if (amount <= 0) {
            System.out.println("Ongeldig aanvulbedrag. Moet groter zijn dan 0.");
            return;
        }

        for (int i = 0; i < this.productList.size(); i++) {
            Product product = this.productList.get(i);

            if (product.getName().equalsIgnoreCase(productName)) {
                int currentAmount = product.getAmount();
                int newAmount = currentAmount + amount;
                product.setAmount(newAmount);

                System.out.println("Voorraad aangevuld: " + amount + " stuks van " + productName + " in de " + this.name + ". Nieuwe voorraad: " + newAmount);
                return;
            }
        }

        System.out.println("De " + this.name + " verkoopt geen " + productName + ". Kan de voorraad niet aanvullen.");
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    //->we gebruiken getters nu
//    //zelfde als bij Customer.java om publiek te maken want was als private gezet
//    public Product getBread() {return bread;}
//    public Product getFruit() {return fruit;}
//    public Product getCheese() {return cheese;}
//    public Product getToiletPaper(){return toiletPaper;}
//
//    public void buyBread (int amount){buyItem(this.bread, amount); }
//    public void buyFruit (int amount){buyItem(this.fruit, amount); }
//    public void buyCheese (int amount){buyItem(this.cheese, amount); }
//    public void buyToiletPaper (int amount){buyItem(this.toiletPaper, amount);}
}