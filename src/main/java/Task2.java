import java.util.*;

public class Task2 {

    public static String task2(List<Integer> integerList) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> positiveLessThat7 = integerList.stream().filter(integer -> integer < 7 && integer >= 0).sorted().toList();
        Map<Integer, Integer> cache = new HashMap<>();
        positiveLessThat7.forEach(integer -> {
            int pairedInteger = 13 - integer;
            if (cache.get(pairedInteger) == null) {
                if (integerList.contains(pairedInteger)) {
                    cache.put(pairedInteger, pairedInteger);
                    stringBuilder.append(integer).append(" ").append(pairedInteger).append("\n");
                }
            } else {
                stringBuilder.append(integer).append(" ").append(pairedInteger).append("\n");
            }

        });
        return stringBuilder.toString();
    }

}
