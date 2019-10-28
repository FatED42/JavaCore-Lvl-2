import java.util.*;

class task1 {

    static void uniqueWords(String[] array) {
        Set<String> unique = new HashSet<>(Arrays.asList(array));
        System.out.println(unique);
    }

    static void repeatNum (String[] array) {
        Map<String, Integer> hm = new HashMap<>();
        for (String word : array) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        System.out.println(hm);
    }
}
