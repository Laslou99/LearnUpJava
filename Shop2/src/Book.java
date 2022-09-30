public class Book extends Product{
    public Book(String name, double price, double weight, String category) {
        super(name, price, weight);
        experidate = -1;
        this.category = category;
    }

    @Override
    public int getExperidate() {
        return -1;
    }

    @Override

    public String getCategory() {
        return "Книги";
    }

    @Override
    public int setExperidate(int experidate) {
        System.out.println("Для книги нельзя установить ссрок годности");
        return experidate
    }
}
