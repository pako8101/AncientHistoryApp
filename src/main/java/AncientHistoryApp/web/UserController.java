package AncientHistoryApp.web;

import AncientHistoryApp.model.binding.UserLoginBindingModel;
import AncientHistoryApp.model.binding.UserSubscribeBindingModel;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/users")
public class UserController {
    private final ModelMapper modelMapper;

    public UserController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
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

        return "redirect:login";

    }


}
