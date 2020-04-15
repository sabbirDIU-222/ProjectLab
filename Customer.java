package instantproject;

public class Customer extends User {

    private String name;
    private String email;
    Iteam iteam;

    public Customer(String name, String email, String userid, String password,Iteam iteam) {
        super(userid, password);
        this.name = name;
        this.email = email;
        this.iteam = iteam;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Iteam getIteam() {
        return iteam;
    }

    public void setIteam(Iteam iteam) {
        this.iteam = iteam;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void display()
    {
        System.out.println("customer name : " + name);
        System.out.println("customer email : " + email);
        iteam.display();
    }

    

    public static void main(String[] args) {
        Iteam iteam = new Iteam("rice",73.0);
        Customer customer1 = new Customer("Sabbir","sabbir18-10@diu.edu","1123","*****",iteam);
    
        customer1.display();
        
        
    }
}

*************** OUTPUT ****************

run:
customer name : Sabbir
customer email : sabbir18-10@diu.edu
iteam name : rice
iteam price : 73.0
BUILD SUCCESSFUL (total time: 0 seconds)


