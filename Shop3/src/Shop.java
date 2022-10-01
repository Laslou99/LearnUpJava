public class Shop implements ShopOfCake, ShopOfSoap, ShopOfBook{
    Product[] products;

    public Shop(Product[] products) {
        this.products = products;
    }


    public Product[] newerThanDate(int daysOfExpire) {
        int b = 0;
        for (int i = 0; i < products.length; i++) {
            if (daysOfExpire < products[i].getExperidate()||
                    products[i].getCategory().contains("Мыло") || products[i].getCategory().contains("Книги")) {
                b++;
            }
        }
        Product[] result = new Product[b];
        for (int i = 0, j = 0; i < products.length; i++) {
            if (daysOfExpire < products[i].getExperidate() || products[i].getCategory().contains("Мыло") || products[i].getCategory().contains("Книги")) {
                result[j] = products[i];
                j++;
            }
        }
        return result;
    }

    public Product[] arrayOfBook() {
        int c = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Книги")) {
                c++;
            }
        }
        Product[] books = new Product[c];
        for (int i = 0, j = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Книги")) {
                books[j] = products[i];
                j++;
            }
        }
        return books;
    }
    public Product[] arrayOfCakes() {
        int c = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Торты")) {
                c++;
            }
        }
        Product[] cakes = new Product[c];
        for (int i = 0, j = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Торты")) {
                cakes[j] = products[i];
                j++;
            }
        }
        return cakes;
    }
    public Product[] arrayOfSoap() {
        int c = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Мыло")) {
                c++;
            }
        }
        Product[] soap = new Product[c];
        for (int i = 0, j = 0; i < products.length; i++) {
            if (products[i].getCategory().equals("Мыло")) {
                soap[j] = products[i];
                j++;
            }
        }
        return soap;
    }

}

