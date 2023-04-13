import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки на чётность: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не чётное");
        }
    }
}
