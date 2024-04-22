package com.bcw.Calculate;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
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


    @GetMapping("/Register")
    String write() {
        return "Register.html";
    }

    @PostMapping("/add")
    String addPost(@RequestParam String USERNAME,
                   @RequestParam String USERID,
                   @RequestParam String USEREMAIL,
                   @RequestParam String USERPW) {
        System.out.println(USERNAME);
        System.out.println(USERID);
        System.out.println(USEREMAIL);
        System.out.println(USERPW);

        UserTable userTable = new UserTable();
        userTable.setUSERNAME(USERNAME);
        userTable.setUSERID(USERID);
        userTable.setUSEREMAIL(USEREMAIL);
        userTable.setUSERPW(USERPW);

        userRepository.save(userTable);
        return "redirect:/list";
    }

}