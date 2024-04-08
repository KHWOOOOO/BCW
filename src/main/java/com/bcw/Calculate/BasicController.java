package com.bcw.Calculate;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        System.out.println("안녕");
        System.out.println("김민재가 수정함");
        System.out.println("김민재가 김형우를 매우 바보라고 생각함");
        return "Register.html";
    }
}