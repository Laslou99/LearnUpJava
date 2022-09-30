public class Soap extends Product{
    public Soap(String name, double price, double weight, String category) {
        super (name, price, weight);
        experidate = -1;
        this.category = category;
    }

    @Override
    public int getExperidate() {
        return -1;
    }

    @Override
    public String getCategory() {
        return "Мыло";
    }

    @Override
    public int setExperidate(int experidate) {
        System.out.println("Для мыла нельзя установить срок годности");
    return experidate;
    }
}