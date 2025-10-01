package OefeningenCursus.Cars;

public class Driver {

    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
    public void printDriver(){
        System.out.println("Eigenaar "+name+" met rijbewijs "+licenseNumber);
    }
}
