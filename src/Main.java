import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Введите пять чисел через пробел (Продажи с понедельника по пятницу) и нажмите ENTER");
        Scanner scanner = new Scanner(System.in);
        int[] sales = new int[5];
        for (int i = 0; i < sales.length; i++)
            sales[i] = scanner.nextInt();
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println("Максимальная сумма продаж в день  " + max);

    }
}

