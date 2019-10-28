import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passValid {

    public static void main(String[] args) {

        String password;
        boolean valid = false;

        System.out.println("Придумайте пароль соответствующий следующим требованиям: ");
        System.out.println("1. Пароль должен быть не менее 8-ми символов.");
        System.out.println("2. В пароле должны быть цифры.");
        System.out.println("3. В пароле должна быть хотя бы 1 строчная буква.");
        System.out.println("4. В пароле должна быть хотя бы 1 заглавная буква.");
        System.out.println("5. Не должно быть пробелов.");

        do {
            System.out.print("Введите пароль: ");
            Scanner scanner = new Scanner(System.in);
            password = scanner.nextLine();
            if (checkValid(password)) {
                System.out.println("Введен корректный пароль");
                valid = true;
            }
            else {
                System.out.println("Введен некорректный пароль, попробуйте еще раз!");
            }
        }
        while (!valid);
    }

    private static boolean checkValid (String password){
        //Pattern p = Pattern.compile("^[a-zA-Z0-9]+\\S.{8,}$");
        Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])\\S{8,}$");
        Matcher m = p.matcher(password);
        return m.matches();
    }


}
