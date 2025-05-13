package main.java.com.joaovictorcmd.userregistry.model.domain;

public class User {

    private String name;
    private String lastName;
    private Long phone;
    private String email;

    public User() {
    }

    public User(String name, String lastName, Long phone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
