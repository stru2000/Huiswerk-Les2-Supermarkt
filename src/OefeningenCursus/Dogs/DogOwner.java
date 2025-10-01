package OefeningenCursus.Dogs;

public class DogOwner {

    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        //this.dog = dog;
    }

    public String getName() {return this.name;}
    public String getSex() {return this.sex;}
    public Dog getDog() {return this.dog;}
    public void setDog(Dog dog) {this.dog = dog;}

    public void changeDogName(String newName) {
        this.dog.setName(newName);
    }

    public void incrementDogAge() {
        this.dog.incrementAge();
    }

    @Override
    public String toString() {
        return this.name + " heeft een " + this.dog.getSex() + "\n" +
        "Deze is " +  this.dog.getAge() + " jaar oud en van het soort: " +  this.dog.getSpecies() + "\n" +
        "De hond heet: " + this.dog.getName();
    }


}
