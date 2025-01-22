package com.sl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sl.entity.User;
import com.sl.service.UserService;

@Controller
public class SignUpController {
	    @Autowired
	    private UserService userService;

	    @GetMapping("/signup")
	    public String showSignUpForm() {
	        return "signup"; // Points to signup.html
	    }

	    @PostMapping("/signup")
	    public String processSignUp(@ModelAttribute User user) {
	        userService.saveUser(user);
	        return "redirect:/signup?success"; // Redirects to a success page or shows success message
	    }
	}


