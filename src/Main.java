import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Njoro", "Male", 185, 85));
        people.add(new Person("Tim", "Male", 183, 82));
        people.add(new Person("Duncan", "Male", 165, 78));
        people.add(new Person("Moses", "Male", 183, 80));
        people.add(new Person("Simon", "Male", 170, 68));
        people.add(new Person("Emmaculate", "Female", 163, 77));
        people.add(new Person("Nancy", "Female", 165, 88));
        people.add(new Person("Omenda", "Male", 185, 70));
        people.add(new Person("Veronicah", "Female", 160, 70));
        people.add(new Person("Musili", "Male", 180, 75));
        people.add(new Person("Kamotho", "Male", 171, 63));
        people.add(new Person("Jonte", "Male", 170, 70));
        people.add(new Person("Reuben", "Male", 170, 60));
        people.add(new Person("Magochi", "Male", 174, 78));
        people.add(new Person("Aviator", "Male", 165, 59));
        people.add(new Person("Ngeno", "Male", 168, 56));
        people.add(new Person("Tarus", "Male", 187, 71));
        people.add(new Person("Kyei", "Male", 168, 63));
        people.add(new Person("Hanson", "Male", 168, 61));
        people.add(new Person("Nancy Rutto", "Female", 168, 58));
        people.add(new Person("Odikor", "Male", 165, 67));
        people.add(new Person("Mercy", "Female", 162, 58));
        people.add(new Person("Wandera", "Male", 166, 60));
        people.add(new Person("Bonnie", "Male", 168, 67));
        people.add(new Person("Berit", "Female", 166, 69));
        people.add(new Person("Paul", "Male", 169, 61));
        people.add(new Person("Andrew", "Male", 180, 68));
        people.add(new Person("Wamuyu", "Female", 164, 69));
        people.add(new Person("Humprey", "Male", 180, 64));
        people.add(new Person("Musili Brian", "Male", 180, 63));
        people.add(new Person("Mabera", "Male", 178, 63));
        people.add(new Person("Oseko", "Male", 178, 60));
        people.add(new Person("Winnie K", "Female", 168, 63));
        people.add(new Person("Isabel", "Female", 163, 70));
        people.add(new Person("Mackrine", "Female", 163, 55));
        people.add(new Person("Asule", "Male", 168, 58));
        people.add(new Person("AnnLiza", "Female", 163, 60));
        people.add(new Person("Lena", "Female", 168, 70));
        people.add(new Person("Immaculate", "Female", 163, 56));
        people.add(new Person("Halkano", "Male", 173, 73));
        people.add(new Person("Greg", "Male", 180, 68));
        people.add(new Person("Cyril", "Male", 169, 70));
        people.add(new Person("Patrick", "Male", 168, 60));
        people.add(new Person("Kevin", "Male", 166, 55));
        people.add(new Person("Patience", "Female", 166, 50));
        people.add(new Person("Angela", "Female", 165, 60));

        List<List<Person>> teams = TeamBuilder.createBalancedTeams(people);
        displayTeams(teams);
    }

    public static void displayTeams(List<List<Person>> teams) {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Team " + (i + 1) + ":");
            for (Person p : teams.get(i)) {
                System.out.println("  " + p);
            }
            System.out.println();
        }
    }
}