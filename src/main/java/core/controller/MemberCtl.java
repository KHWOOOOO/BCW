package core.controller;

import core.model.Member;
import core.repository.MemberRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberCtl {

    private final MemberRepo userRepository;

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    @PostMapping("/add")
    public String addPost(@RequestParam String USERNAME,
                          @RequestParam String USERID,
                          @RequestParam String USEREMAIL,
                          @RequestParam String USERPW,
                          Model model) {

        if (userRepository.existsByUSERNAME(USERNAME)) {
            model.addAttribute("errorMessage", "중복되는 닉네임이 있습니다. 다시 확인해주세요.");
            return "register.html";  // 등록 페이지로 다시 이동
        }

        Member member = new Member();
        member.setUSERNAME(USERNAME);
        member.setUSERID(USERID);
        member.setUSEREMAIL(USEREMAIL);
        member.setUSERPW(USERPW);

        userRepository.save(member);
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
