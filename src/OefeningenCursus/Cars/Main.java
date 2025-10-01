package OefeningenCursus.Cars;

public class Main {

    public static void main(String[] args) {
        Car carFiat = new Car("Fiat","500","groene",2019 , 1.5);
        Car carToyota = new Car("Toyota","Aygo","blauwe",2016,1.2);
        Car carVolvo = new Car("Volvo","CX90","zwart",2022,2.0);

        carFiat.printCarSpecs();
        carToyota.printCarSpecs();
        carVolvo.printCarSpecs();

        Driver driverRobin = new Driver("Robin","ABC-4512");
        Driver driverSten = new Driver("Sten","geen");

        driverRobin.printDriver();
        driverSten.printDriver();
    }
}
