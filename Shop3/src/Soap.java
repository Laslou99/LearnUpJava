public class Soap extends Product implements ExperiDate{
    public Soap(String name, double price, double weight, String category) {
        super(name, price, weight);
        this.category = category;
    }

    @Override
    public String getCategory() {
        return "Мыло";
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

