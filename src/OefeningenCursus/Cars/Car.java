package OefeningenCursus.Cars;

public class Car {


    private String brand;
    private String model;
    private String color;
    private int year;
    private double engineVolume;


    public Car(String brand, String model, String color, int year, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void printCarSpecs () {
        System.out.println("De "+color+" "+brand+" "+model+" uit "+year+" heeft als volumeInhoud "+engineVolume);
    }

}