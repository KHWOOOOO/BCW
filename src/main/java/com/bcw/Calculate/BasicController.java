package com.bcw.Calculate;

import com.bcw.Calculate.member.UserRepository;
import com.bcw.Calculate.member.UserTable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BasicController {

    private final UserRepository userRepository;

    @GetMapping("/main")
    String list(Model model) {
        List<UserTable> result = userRepository.findAll();
        System.out.println(result);
        model.addAttribute("USERNAME", result);
        return "index";  // 확장자 없이 템플릿 이름만 리턴
    }

    @GetMapping("/login")
    String login() {
        return "login";  // 확장자 없이 템플릿 이름만 리턴
    }

    @GetMapping("/register")
    String write() {
        return "Register";  // 확장자 없이 템플릿 이름만 리턴
    }

    @GetMapping("/Challenge")
    String Challenge() {
        return "Challenge";  // 확장자 없이 템플릿 이름만 리턴
    }
}
