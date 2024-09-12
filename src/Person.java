public class Person {
    private String name;
    private String gender;
    private double height;
    private double weight;

    public Person(String name, String gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + height + "cm, " + weight + "kg)";
    }
}
