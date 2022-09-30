package threeLessen;

import java.util.Locale;

public class Shop {
    public int productCount;
    public Product[] products = Product.products();

    public void Arr() {
        products = Product.products();
        productCount = 0;
        addProduct(new Product("tea", 85));
        addProduct(new Product("sour cream", 65));
        addProduct(new Product("beer", 75));
        addProduct(new Product("milk", 67));
        addProduct(new Product("cheese", 150));
        addProduct(new Product("cofe", 250));


        System.out.println("Now in the store: " +
                products.length + " products");
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            int newProductLenght = products.length + 1;

            Product[] newProduct = new
                    Product[newProductLenght];

            for (int i = 0; i < products.length; i++) {
                newProduct[i] = products[i];
            }
            products = newProduct;
            products[productCount] = product;
            productCount++;
        }
    }

    public void lowPrice() {
        int lowPrice = 70;
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrise() < lowPrice) {
                count++;
            }
        }
        System.out.println("There are fewer products at the moment " +
                lowPrice + " rub: " + count + " pc.");

        Product[] prod = new Product[count];
        prod[0] = products[1];
        prod[1] = products[3];
        System.out.println("There are fewer products " + lowPrice + " rub: "
                + prod[0].getName() + " " + prod[0].getPrise() + " rub, "
                + prod[1].getName() + " " + prod[1].getPrise() + " rub");

    }

    public void Test(String findStr) {
        for (int j = 0; j < products.length; j++) {
            if (products[j].getName().toLowerCase(Locale.ROOT) ==
                    findStr.toLowerCase(Locale.ROOT)) {
                System.out.println(products[j].getName() + ": " +
                        products[j].getPrise());
            }
        }
    }
}