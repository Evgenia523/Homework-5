import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку текста: ");
        String text = scanner.nextLine();
        System.out.println("Введите символ:  ");
        char symbol = scanner.next().charAt(0);

        int count = 0;
        System.out.println("Интексы вхождений символа:  ");
        for (int i = 0; i< text.length(); i++) {
            if (text.charAt(i) == symbol) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count >0 ) {
            System.out.println(("\nКоличество совпадений: " + count));
        } else {
            System.out.println("\nСовпадений не найдено. ");
        }
    }
}
