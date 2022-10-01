public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Book("Book 1", 400, 120, "Книги");
        products[1] = new Book("Book 2", 30, 200, "Книги");
        products[2] = new Cake("Cake 1", 500, 130, "Торты");
        products[2].setExperidate(60);
        products[3] = new Cake("Cake 2", 199, 500, "Торты");
        products[3].setExperidate(70);
        products[4] = new Soap("Soap 1", 300, 400, "Мыло");
        products[5] = new Soap("Soap 2", 40, 300, "Мыло");

        Shop shop = new Shop(products);
        Product[] result1 = shop.newerThanDate(6);
        for (int i = 0; i < products.length; i++) {
            System.out.println(result1[i].getName());
        }
    }
}