import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task3 {
    public static int task3(String connections) {
        List<String[]> collect = Arrays.stream(connections.split("\n"))
                .filter(s -> s.contains(" "))
                .map(s -> (s.split(" ")))
                .sorted((o1, o2) -> Integer.parseInt(o1[0]) < Integer.parseInt(o2[0]) ? 1 : 0)
                .toList();

        int connectionsNumber = 1;
        for (int i = 0; i < collect.size() - 1; i++) {
            if (!Objects.equals(collect.get(i)[1], collect.get(i + 1)[0])) {
                connectionsNumber++;
            }
        }
        return connectionsNumber;
    }

}
