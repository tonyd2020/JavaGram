package com.anthonydera.workbook;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    User user = new User();

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("user", user);
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult(Model model) {
        model.addAttribute("user", user).toString();
        return "result";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result){
        if(result.hasErrors()) return "sign-up";
        System.out.println(user.toString());
        this.user = user;

        return "redirect:/result";
    }
    
}
