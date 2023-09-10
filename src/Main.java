import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int a = 1; a <= 10; a++){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача №2");
        for (int a = 10; a >= 1; a--){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача №3");
        for (int a = 0; a < 17; a +=2){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача №4");
        for (int a = 10; a >= -10; a--){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача №5");
        for (int year = 1904; year <= 2096; year = year +4){
            System.out.print(year + " ");
        }
        System.out.println();

        System.out.println("Задача №6");
        for (int a = 7; a <= 98; a +=7){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Задача №7");
        for (int a = 1; a <= 512; a *=2){
            System.out.print(a + " ");
        }
        System.out.println();

        NumberFormat  numberFormat = NumberFormat.getCurrencyInstance();

        System.out.println("Задача №8");
        int savings = 29000;
        double Total = 0;
        for (int month = 1; month <= 12; month++){
            Total = Total + savings;
            System.out.println("Месяц " + month + " сумма накоплений равна " + numberFormat.format(Total));
        }
        System.out.println();

        System.out.println("Задача №9");
        Total = 0;
        double  percent = 1 / 100D;
        for (int month = 1; month <= 12; month++){
            Total += savings;
            Total = Total * (1 + percent);
            System.out.println("Месяц " + month + " сумма накоплений равна " + Total + numberFormat.format(Total));
        }
        System.out.println();

        System.out.println("Задача №10");
        for (int multiplicationTable = 1; multiplicationTable <= 10; multiplicationTable++){
            System.out.println("2 x " + multiplicationTable + " = " + 2 * multiplicationTable);
        }
        System.out.println("конец");
    }
}