package core.controller;

import core.repository.MemberRepo;
import core.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BaseCtl {

    private final MemberRepo userRepository;

    @GetMapping("/main")
    String list(Model model) {
        List<Member> result = userRepository.findAll();
        System.out.println(result);
        model.addAttribute("USERNAME", result);
        return "index";  // 확장자 없이 템플릿 이름만 리턴
    }

    @GetMapping("/login")
    String login() {
        return "member/login";  // 확장자 없이 템플릿 이름만 리턴
    }

    @GetMapping("/register")
    String write() {
        return "member/register";  // 확장자 없이 템플릿 이름만 리턴
    }

    @GetMapping("/Challenge")
    String Challenge() {
        return "member/challenge";  // 확장자 없이 템플릿 이름만 리턴
    }
}
