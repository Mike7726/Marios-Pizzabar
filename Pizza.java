public class Pizza {
    private String ID;
    private String description;
    private int price;

    Pizza(String ID, String description, int price){
        this.ID = ID;
        this.description = description;
        this.price = price;
    }
    public String getID(){
        return ID;
    }
}
