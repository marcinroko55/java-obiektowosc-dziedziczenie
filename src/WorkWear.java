public class WorkWear extends Product{
    private String size;

    public WorkWear(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
