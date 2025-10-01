package Homework;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {

        //Productlijsten met 4 producten

        List<Product> productsHalbertEijn = new ArrayList<>();
        productsHalbertEijn.add(new Product("Bread", 1.59, 40));
        productsHalbertEijn.add(new Product("Fruit", 0.75, 100));
        productsHalbertEijn.add(new Product("Cheese", 6.00, 20));
        productsHalbertEijn.add(new Product("ToiletPaper", 4.00, 15));

        List<Product> productsDumbo = new ArrayList<>();
        productsDumbo.add(new Product("Apples", 1.20, 70));
        productsDumbo.add(new Product("Pears", 1.50, 60));
        productsDumbo.add(new Product("Cereal", 2.99, 25));
        productsDumbo.add(new Product("Juice", 1.75, 45));

        List<Product> productsCaldi = new ArrayList<>();
        productsCaldi.add(new Product("Milk", 1.09, 55));
        productsCaldi.add(new Product("Eggs", 2.50, 80));
        productsCaldi.add(new Product("Coffee", 3.85, 30));
        productsCaldi.add(new Product("Yogurt", 0.65, 90));

        //3 supermarktinstanties

        SuperMarket halbertEijn = new SuperMarket("Halbert Eijn", productsHalbertEijn);
        SuperMarket dumbo = new SuperMarket("Dumbo", productsDumbo);
        SuperMarket caldi = new SuperMarket("Caldi", productsCaldi);

        //hashmap
        Map<String, SuperMarket> superMarkets = new HashMap<>();
        superMarkets.put("halbert eijn", halbertEijn);
        superMarkets.put("dumbo", dumbo);
        superMarkets.put("caldi", caldi);


        Customer customer = new Customer("Robin");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, " + customer.getCustomerName() + "! We have " + superMarkets.size() + " supermarkets ready for you.");

        boolean running = true;
        while (running) {
            System.out.println("----------------------------------------");
            System.out.println("What do you want to do?");
            System.out.println("1 - Pick a supermarket");
            System.out.println("2 - buy a product");
            System.out.println("3 - restock a product");
            System.out.println("4 - exit");
            System.out.print("Enter choice (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ongeldige invoer. Voer een nummer (1-4) in.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    SuperMarket chosenMarket = getSuperMarketChoice(scanner, superMarkets, "Which supermarket do you want to go to?");

                    if (chosenMarket != null) {
                        customer.goToSuperMarket(chosenMarket);
                    } else {
                        // De feedback wordt al gegeven in de helper-methode, maar hier kunnen we een extra foutmelding geven als null terugkomt
                        System.out.println("Supermarkt niet gevonden. Probeer opnieuw.");
                    }
                    break;

                case 2:
                    if (customer.getSuperMarket() == null) {
                        System.out.println("Kies eerst een supermarkt (Keuze 1).");
                        break;
                    }

                    System.out.println("Which product do you want to buy from " + customer.getSuperMarket().getName() + "?");
                    String productName = scanner.nextLine().trim();

                    System.out.println("How many do you want to buy?");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Ongeldig aantal. Voer een nummer in.");
                        scanner.nextLine();
                        break;
                    }
                    int productAmount = scanner.nextInt();
                    scanner.nextLine();

                    customer.buyItem(productName, productAmount);
                    break;

                case 3:
                    SuperMarket marketToRestock = getSuperMarketChoice(scanner, superMarkets, "Which supermarket do you want to restock?");

                    if (marketToRestock != null) {

                        System.out.println("Which product do you want to restock in " + marketToRestock.getName() + "?");
                        productName = scanner.nextLine().trim();

                        System.out.println("How many do you want to add?");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Ongeldig aantal. Voer een nummer in.");
                            scanner.nextLine();
                            break;
                        }
                        int restockAmount = scanner.nextInt();
                        scanner.nextLine();

                        marketToRestock.restockItem(productName, restockAmount);

                    } else {
                        // De feedback wordt al gegeven in de helper-methode, maar hier kunnen we een extra foutmelding geven als null terugkomt
                        System.out.println("Supermarkt niet gevonden. Kan voorraad niet aanvullen.");
                    }
                    break;

                case 4:
                    System.out.println("Bedankt voor het winkelen! Tot ziens.");
                    running = false;
                    break;

                default:
                    System.out.println("Ongeldige keuze. Voer een nummer in tussen 1 en 4.");
                    break;
            }
        }

    }

    private static SuperMarket getSuperMarketChoice(Scanner scanner, Map<String, SuperMarket> superMarkets, String prompt) {
        System.out.println(prompt);
        System.out.println("Pick one of the following: Halbert Eijn, Dumbo, Caldi");
        String superMarketChoice = scanner.nextLine().trim().toLowerCase();

        SuperMarket chosenMarket = superMarkets.getOrDefault(superMarketChoice, null);

        if (chosenMarket == null) {
            System.out.println("Supermarkt '" + superMarketChoice + "' niet gevonden. Probeer opnieuw.");
        }

        return chosenMarket;
    }
}