public abstract class Product implements ExperiDate {

    private String name;
    private double price;
    private double weight;
    protected String category;
    protected int experiDate;

    public Product(String name, double price, double weight){
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



    public abstract String getCategory();
//   @Override
//    public int getExperidate() {
//        return 0;
//    }
//    @Override
//    public int setExperidate(int experidate) {
//        return experidate;
//    }




}


