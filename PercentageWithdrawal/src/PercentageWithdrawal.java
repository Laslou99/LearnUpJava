public class PercentageWithdrawal {
    static int GoalAge = 60;

    public static void main(String[] args) {
        float sum = PercentageWithdrawal.percent(22, 2.6F, 10000L);
        System.out.println("Percentage withdrawal: " + sum);

    }

    public static float percent(int age, float rate, long amount) {
        float sum = rate / 100 * amount * (GoalAge - age);
        return sum;

    }
}
