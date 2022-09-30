package finance;

class Main {
    public static void main(String[] args) {
        int age = 23;
        long amount = 1000L;
        float rate = 3.4F;
        System.out.println("Accumulated interest on the deposit: " +
                BanckUntils.percent(age, rate, amount));
    }
}
