import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        System.out.println("Задание №7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isDigit(c)) {
                result += "_";
            } else {
                result += c;
            }
        }
        System.out.println(" Результат: " + result);
    }
}
