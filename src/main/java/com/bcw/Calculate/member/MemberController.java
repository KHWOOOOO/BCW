package com.bcw.Calculate.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final UserRepository userRepository;

    @GetMapping("/Register")
    public String register() {
        return "Register.html";
    }

    @PostMapping("/add")
    public String addPost(@RequestParam String USERNAME,
                          @RequestParam String USERID,
                          @RequestParam String USEREMAIL,
                          @RequestParam String USERPW) {

        UserTable userTable = new UserTable();
        userTable.setUSERNAME(USERNAME);
        userTable.setUSERID(USERID);
        userTable.setUSEREMAIL(USEREMAIL);
        userTable.setUSERPW(USERPW);

        userRepository.save(userTable);
        return "redirect:/list";
    }

    @PostMapping("/userlogin")
    public String loginPost(@RequestParam String UserId,
                            @RequestParam String userPassWord){
        System.out.println(UserId);
        System.out.println(userPassWord);

        return "redirect:/list";
    }
}
