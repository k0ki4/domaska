import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите полученную сумму:  ");
        double vklad = scan.nextDouble();
        System.out.println("Введите кол-во месяцев:  ");
        int month = scan.nextInt();
        double proc = 7 / 100.0 + 1.0;
        while (month > 0) {
            month--;
            vklad *= proc;
            System.out.println(vklad);
        }
        System.out.println(vklad);

    }
}
