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

        }
        System.out.println("Месяц " + month + " - сумма накоплений равна " + result + " рублей");

        System.out.println("Задание-2");

        int x = 0;

        while (x < 10) {
            x++;
            System.out.print(x + " ");
        }
        System.out.println();
        for (; x > 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Задание-3");

        int fertility = 17;
        int mortality = 8;
        int currentYear = 2024;
        int population = 12_000_000;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += (population / 1000) * ((fertility - mortality));
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Задание-4");
        int money = 15000;
        int interestRateOfDeposit = 7;
        int accumulationAmount = 12_000_000;
        int year = 0;
        while (money <= accumulationAmount) {
            money += money * interestRateOfDeposit / 100;
            year++;
            System.out.println("Накопление в " + year + " месяце составит " + money
            );
        }
        System.out.println("Задание-5");
        int money1 = 15000;
        int interestRateOfDeposit1 = 7;
        int accumulationAmount1 = 12_000_000;
        int year1 = 0;
        while (money1 <= accumulationAmount1) {
            money1 += money1 * interestRateOfDeposit1 / 100;

            year1++;
            if (year1 % 6 == 0) {
                System.out.println("Накопление в " + year1 + " месяце составит " + money1);
            }

        }


    }
}