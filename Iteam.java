package instantproject;

public class Iteam {

    private String itemname;
    private double price;
    Customer cus;

    public Iteam(String itemname, double price) {
        this.itemname = itemname;
        this.price = price;
    }

    
    public void display() {
        System.out.println("iteam name : " + itemname);
        System.out.println("iteam price : " + price);
      
        
    }
}
