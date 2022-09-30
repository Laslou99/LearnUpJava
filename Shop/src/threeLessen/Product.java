package threeLessen;

public class Product {
    private String name;
    private int price;

    public void setName(String Name) {
        name = Name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int Price) {
        price = Price;
    }

    public int getPrise(){
        return price;
    }

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public static Product[] products()  {
        Product[] products = new Product[0];

        return products;
    }
}
