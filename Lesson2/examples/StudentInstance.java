package Lesson2.examples;

public class StudentInstance {

    private String fullName;
    private String username;
    private String email;

    public StudentInstance(String fullName) {
        this.fullName = fullName;
        setUsername(fullName);
        setEmail();
    }
    public void setUsername(String username) {
        this.username = fullName.split(" ")[0].substring(0,3) + fullName.split("")[1].substring(0,3);
    }

    public void setEmail() {
        this.email = username + "@taltech.ee";
    }
}
