import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static final String NEW_LINE = "\n";

    public static String task1(List<Integer> integerList) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> integersSorted = integerList.stream().sorted().distinct().toList();
        stringBuilder.append(integersSorted.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        stringBuilder.append(NEW_LINE);
        stringBuilder.append("count: ").append(integerList.size()).append(NEW_LINE);
        stringBuilder.append("distinct: ").append(integerList.stream().distinct().count()).append(NEW_LINE);
        stringBuilder.append("min: ").append(integersSorted.get(0)).append(NEW_LINE);
        stringBuilder.append("max: ").append(integersSorted.get(integersSorted.size() - 1));
        return stringBuilder.toString();
    }

}
