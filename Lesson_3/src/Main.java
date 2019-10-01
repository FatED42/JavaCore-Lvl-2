public class Main {

    public static void main(String[] args) {

        // Задание 1.
        String[] words = {"Work", "Java", "Friend", "Study", "Car", "Computer", "Java", "Student", "Car", "Walk", "Figure", "Work", "Money"};

        task1.uniqueWords(words);
        task1.repeatNum(words);

        // Задание 2.
        Phonebook pb = new Phonebook();

        pb.add("Petrov", "1465795", "1467953", "1462567");
        pb.add("Ivanov", "4789464");
        pb.add("Suhov", "4879632");

        System.out.print("Номера данного абонента: ");
        System.out.println(pb.get("Petrov"));

    }

}
