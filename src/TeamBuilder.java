import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeamBuilder {

    public static List<List<Person>> createBalancedTeams(List<Person> people) {
        List<List<Person>> teams = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            teams.add(new ArrayList<>());
        }

        Collections.sort(people, (p1, p2) -> {
            int genderComparison = p1.getGender().compareTo(p2.getGender());
            if (genderComparison != 0) return genderComparison;

            int heightComparison = Double.compare(p1.getHeight(), p2.getHeight());
            if (heightComparison != 0) return heightComparison;

            return Double.compare(p1.getWeight(), p2.getWeight());
        });

        for (int i = 0; i < people.size(); i++) {
            teams.get(i % 4).add(people.get(i));
        }

        return teams;
    }

}
