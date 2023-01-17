package Entity;

public class Login_Staff_Entity extends Biodata_Entity {
    public String password;
    public Login_Staff_Entity(String username, String password) {
        super(username);
        this.password = password;
    }
    public Login_Staff_Entity() {
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
