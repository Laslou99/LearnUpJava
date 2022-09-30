public abstract class Product {
    private String name;
    private double price;
    private double weight;
    protected int experidate;
    protected String category;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract int getExperidate();

    public abstract String getCategory();

    public abstract int setExperidate(int experidate);
}