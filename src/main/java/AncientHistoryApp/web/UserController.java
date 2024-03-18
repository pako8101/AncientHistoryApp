package AncientHistoryApp.web;

import AncientHistoryApp.model.binding.UserLoginBindingModel;
import AncientHistoryApp.model.binding.UserSubscribeBindingModel;
import AncientHistoryApp.model.service.UserServiceModel;
import AncientHistoryApp.model.view.USerViewModel;
import AncientHistoryApp.service.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {
    private final ModelMapper modelMapper;
    private final UserService userService;

    public UserController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }
    @ModelAttribute
    public UserSubscribeBindingModel userSubscribeBindingModel(){
        return new UserSubscribeBindingModel();
    }
    @ModelAttribute
public UserLoginBindingModel userLoginBindingModel(){
        return new UserLoginBindingModel();
    }

    @GetMapping("/subscribe")
    public String subscribe(Model model){
        if (!model.containsAttribute("userSubscribeBindingModel")) {
            model.addAttribute("userSubscribeBindingModel", new UserSubscribeBindingModel());
        }
        return "subscribe";
    }

    @PostMapping("/subscribe")
    public String subscribeConfirm(@Valid UserSubscribeBindingModel userSubscribeBindingModel,
                                   BindingResult bindingResult,
                                   RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors() || !userSubscribeBindingModel.getPassword()
                .equals(userSubscribeBindingModel.getConfirmPassword())){
            redirectAttributes.addFlashAttribute("org.springframework" +
                    ".validation.BindingResult" +
                    ".userSubscribeBindingModel", bindingResult);
            return "redirect:subscribe";
        }
userService.subscribeUser(modelMapper.map(userSubscribeBindingModel,
        UserServiceModel.class));
        return "redirect:login";

    }

    @GetMapping("/login")
    public String login(Model model){
        if (!model.containsAttribute("isFound")){
            model.addAttribute("isFound",true);

        }
        return "login";
    }
@PostMapping("/login")
    public String loginConfirm(@Valid UserLoginBindingModel userLoginBindingModel,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("userLoginBindingModel");
            redirectAttributes.addFlashAttribute(userLoginBindingModel);

            return "redirect:login";
        }
            UserServiceModel userServiceModel =
                    userService.findByUsernameAndPassword(userLoginBindingModel.getUsername(),
                            userLoginBindingModel.getPassword());

            if (userServiceModel== null){
                redirectAttributes.addFlashAttribute("userLoginBindingModel",userLoginBindingModel);
                redirectAttributes.addFlashAttribute("isFound",false);
                redirectAttributes.addFlashAttribute("org.springframework" +
                        ".validation.BindingResult" +
                        ".userLoginBindingModel",bindingResult);
                return "redirect:login";

        }
userService.loginUser(userServiceModel.getId(),
        userLoginBindingModel().getUsername());
            return "redirect:/";
}

@GetMapping("/logout")
public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";

}
@GetMapping("/profile/{id}")
public String profile(@PathVariable Long id, Model model){
        model
                .addAttribute("user", modelMapper
                        .map(userService.findById(id), USerViewModel.class));
return "profile";

    }
}
