public class Main {
    public static void main(String[] args) {

        System.out.println("Home Work-7");


        System.out.println("Задание-1");

        int moneyMonthly = 15000;
        int accumulation = 2_459_000;
        int result = 0;
        int month = 0;
        while (result < accumulation) {
            moneyMonthly = moneyMonthly + moneyMonthly / 100;
            result = result + moneyMonthly;
            month++;
            System.out.println("Месяц " + month + " - сумма накоплений равна " + result + " рублей");
        }
    }
}