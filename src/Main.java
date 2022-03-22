public class Main {
    public static void main(String[] args) {
        int remainder = 100;//Остаток на счете
        int replenishment = 900;//Сумма пополнения счета
        boolean condition = replenishment > 1000;// Условия акции
        int bonus;
        if (condition) {
            bonus = replenishment / 100;
        }//Расчет суммы бонуса
        else {
            bonus = 0;
        }
        int total = remainder + replenishment + bonus;//Баланс счета
        // Вывод на экран
        System.out.println((bonus) + " Бонусных рублей");
        System.out.println((total) + " Рублей счете");
    }
}