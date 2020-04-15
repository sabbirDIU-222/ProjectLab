package instantproject;

public class User {

    protected String userid;

    protected String password;

    public User(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }
    
    public void display(){
        System.out.println("user info");
        
    }

    
}
