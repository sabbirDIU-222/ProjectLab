package instantproject;

public class User {

    protected String userid;

    protected String password;

    public User(String userid, String password) {
        this.userid = userid;
        this.password = password;
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
    
    public void display(){
        System.out.println("user info");
        
    }

    
}
