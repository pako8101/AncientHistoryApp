package AncientHistoryApp.model.service;

import AncientHistoryApp.model.entity.Action;
import AncientHistoryApp.model.entity.enums.PeriodEnum;

import java.util.Set;

public class UserServiceModel {
    private Long id;
    private String username;
    private String fullName;

    private String password;

    private String email;

    private Integer age;

    private Set<Action> actions;

    private PeriodEnum periods;

    public UserServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public PeriodEnum getPeriods() {
        return periods;
    }

    public void setPeriods(PeriodEnum periods) {
        this.periods = periods;
    }
}
