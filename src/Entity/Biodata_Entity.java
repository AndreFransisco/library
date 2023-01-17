package Entity;

public class Biodata_Entity {
    protected String username;
    public Biodata_Entity() {
    }
    public Biodata_Entity(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}