package finance;

class BanckUntils {
    static int goalAge = 60;
    public static float percent(int age, float rate, long amount) {
        float sum = amount / 100 * rate * (goalAge - age);
        return sum;
    }
}
