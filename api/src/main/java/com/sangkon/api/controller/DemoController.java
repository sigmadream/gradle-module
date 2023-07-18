package com.sangkon.api.controller;

import com.sangkon.api.service.DemoService;
import com.sangkon.common.domain.Member;
import com.sangkon.common.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;
    private final MemberRepository memberRepository;

    @Value("${profile-name}")
    private String name;

    @GetMapping("/save")
    public String save() {
        System.out.println(name);
        memberRepository.save(Member.builder().name(Thread.currentThread().getName()).build());
        return "save";
    }

    @GetMapping("/find")
    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
        return demoService.find();
    }

    @GetMapping("/exception")
    public String exception() {
        return demoService.exception();
    }
}
