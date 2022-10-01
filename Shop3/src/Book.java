public class Book extends Product implements ExperiDate{
    public Book(String name, double price, double weight, String category) {
        super(name, price, weight);
        this.category = category;
    }

    @Override
    public String getCategory() {
        return "Книги";
    }

    @Override
    public void setExperidate(int experidate) {
        this.experiDate = experidate;
    }

    @Override
    public int getExperidate() {
        return this.experiDate;
    }
}
