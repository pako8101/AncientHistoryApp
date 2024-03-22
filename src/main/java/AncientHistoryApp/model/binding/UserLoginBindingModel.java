package AncientHistoryApp.model.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserLoginBindingModel {
    @Size(min = 3,max = 20)
    @NotNull
    private String username;
    @Size(min = 3,max = 20)
    @NotNull
    private String password;

    public UserLoginBindingModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
