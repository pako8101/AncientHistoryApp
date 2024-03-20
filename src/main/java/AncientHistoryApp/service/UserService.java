package AncientHistoryApp.service;

import AncientHistoryApp.model.entity.User;
import AncientHistoryApp.model.service.UserServiceModel;

public interface UserService {

    void subscribeUser(UserServiceModel userServiceModel);


    void loginUser(Long id, String username);

    UserServiceModel findByUsernameAndPassword(String username, String password);

    UserServiceModel findById(Long id);

    User findCurrentUserLoginEntity();
}
