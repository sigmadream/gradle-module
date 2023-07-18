package com.sangkon.api.controller;

import com.sangkon.api.service.DemoService;
import com.sangkon.common.domain.Member;
import com.sangkon.common.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;
    private final MemberRepository memberRepository;

    @GetMapping("/save")
    public String save() {
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
