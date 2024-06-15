package com.bcw.Calculate;

import com.bcw.Calculate.member.UserRepository;
import com.bcw.Calculate.member.UserTable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class BasicController {

    private final UserRepository userRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<UserTable> result = userRepository.findAll();
        System.out.println(result);
        model.addAttribute("USERNAME", result);
        return "index.html";
    }

    @GetMapping("/login")
    String login(){
        return "login.html";
    }

    @GetMapping("/register")
    String write() {
        return "Register.html";
    }

}