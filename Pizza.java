public class Pizza {
    private Integer ID;
    private String description;
    private int price;

    Pizza(int ID, String description, int price) {
        this.ID = ID;
        this.description = description;
        this.price = price;
    }

    public Integer getID() {
        return ID;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return ID + ": " + description + "......." + price;
    }
}
