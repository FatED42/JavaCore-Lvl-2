import java.util.*;

class Phonebook {

    private Map<String, HashSet<String>> map;

    Phonebook() {
        this.map = new HashMap<>();
    }

    void add(String surname, String ... phoneNumber) {
        HashSet<String> numbers;

         numbers = map.containsKey(surname) ? map.get(surname) : new HashSet<>();
         numbers.addAll(Arrays.asList(phoneNumber));
         map.put(surname, numbers);
    }

    Set<String> get(String surname) {
        return map.get(surname);
    }

}
