package AncientHistoryApp.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    @Column(unique = true,nullable = false)
    private String username;

    @Column(name = "full_name",nullable = false)
    private String fullName;
    @Column(name = "password", nullable = false)
    private String password;

    @Column(unique = true,nullable = false)
    private String email;
    @Column(name = "age")
    private Integer age;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Action> actions;



    public User() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Action> getFunctions() {
        return actions;
    }

    public void setFunctions(Set<Action> actions) {
        this.actions = actions;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
