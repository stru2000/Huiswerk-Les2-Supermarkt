package OefeningenCursus.Dogs;

public class Dog {

    private String name;
    private final String species;
    private int age;
    private final String sex;

    public Dog (String name, String species, int age, String sex) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
    }


    public String getName() {return this.name;}
    public String getSpecies() {return this.species;}
    public int getAge() {return this.age;}
    public String getSex() {return this.sex;}

    public void setName(String name) {this.name = name;}
    public void incrementAge() {this.age++;}



}
