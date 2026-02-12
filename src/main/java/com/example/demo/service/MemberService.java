package com.example.demo.service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member register(String email, String password, String name) {

        Member member = Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .createdAt(LocalDateTime.now())
                .build();

        return memberRepository.save(member);
    }
}
