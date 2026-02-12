package com.example.demo.controller;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public Member register(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String name
    ) {
        return memberService.register(email, password, name);
    }
}
