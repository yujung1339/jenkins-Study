package org.example.simple1.controller;

import org.example.simple1.dto.MemberDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @GetMapping("/")
    public MemberDto test() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test");
        memberDto.setAge(20);
        return memberDto;
    }

    @GetMapping("/test1")
    public MemberDto test1() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test1");
        memberDto.setAge(20);
        return memberDto;
    }

    @GetMapping("/test2")
    public MemberDto test2() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test2");
        memberDto.setAge(20);
        return memberDto;
    }

    @GetMapping("/test3")
    public MemberDto test3() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test3");
        memberDto.setAge(20);
        return memberDto;
    }
}