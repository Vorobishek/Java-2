public class Main {
    public static void main(String[] args) {

        int lastBalance = 100;
        int addBalance = 1100;
        int currentBalance;
        int bonus = 1;
        int bonusSum;

        if (addBalance > 1000) {
            bonusSum = (addBalance / 100) * bonus;
            currentBalance = lastBalance + addBalance + bonusSum;
        } else {
            currentBalance = lastBalance + addBalance;
            bonusSum = 0;
        }
        System.out.println(  "Бонус = " + bonusSum + " Текущая сумма на счету = " + currentBalance);



        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
