public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int balanceReplenishment = 1542;
        int bonus = balanceReplenishment / 100;

        if (balanceReplenishment > 1000) {
            bonus = balanceReplenishment / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = balance + balanceReplenishment;
        int totalBalance = totalAmount + bonus;

        System.out.println(totalAmount);
        System.out.println(bonus);
        System.out.println(totalBalance);

    }

}