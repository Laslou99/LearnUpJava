public class Cake extends Product {
    public Cake(String name, double price, double weight, String category) {
        super(name, price, weight);
        this.category = category;
    }


    @Override
    public String getCategory() {
        return "Торты";
    }

    @Override
    public int getExperidate() {
        return this.experiDate;
    }

    @Override
    public void setExperidate(int experidate) {
        this.experiDate = experidate;
    }
}
