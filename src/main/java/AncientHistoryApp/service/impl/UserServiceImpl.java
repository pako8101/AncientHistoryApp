package AncientHistoryApp.service.impl;

import AncientHistoryApp.model.entity.User;
import AncientHistoryApp.model.service.UserServiceModel;
import AncientHistoryApp.repository.UserRepository;
import AncientHistoryApp.service.UserService;
import AncientHistoryApp.utils.CurrentUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final CurrentUser currentUser;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository, CurrentUser currentUser) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    @Override
    public void subscribeUser(UserServiceModel userServiceModel) {
User user = modelMapper.map(userServiceModel, User.class);
userRepository.saveAndFlush(user);
    }
    @Override
    public void loginUser(Long id, String username) {
currentUser.setId(id);
currentUser.setUsername(username);
    }

    @Override
    public UserServiceModel findByUsernameAndPassword(String username, String password) {
        return userRepository.findUserByUsernameAndPassword(username,password)
                .map(user -> modelMapper.map(user,UserServiceModel.class))
                .orElse(null);
    }

    @Override
    public UserServiceModel findById(Long id) {
        return userRepository.findById(id)
                .map(user -> modelMapper.map(user,UserServiceModel.class))
                .orElse(null);
    }

    @Override
    public User findCurrentUserLoginEntity() {
        return userRepository.findById(currentUser.getId())
                .orElse(null);
    }


}
