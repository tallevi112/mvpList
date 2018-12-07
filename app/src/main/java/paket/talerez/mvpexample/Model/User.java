package paket.talerez.mvpexample.Model;

public class User {

    private String fullName;
    private String email;

    public User(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public User() { }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "email:"+email+"\nFullName:"+fullName;
    }
}
