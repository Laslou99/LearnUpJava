public class Cake extends Product {
    public Cake(String name, double price, double weight, String category) {
        super(name, price, weight);
        this.category = category;
    }

    @Override
    public int getExperidate() {
        return experidate;
    }

    @Override
    public String getCategory() {
        return "Торты";
    }

    @Override
    public int setExperidate(int experidate) {
        this.experidate = experidate;
        return experidate;
    }
}
