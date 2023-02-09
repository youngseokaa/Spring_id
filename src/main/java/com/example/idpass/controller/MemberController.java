package com.example.idpass.controller;

import com.example.idpass.passdto.MemberResponseDto;
import com.example.idpass.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/member/{id}")
    public MemberResponseDto getMemberInfo(@PathVariable Long id) {
        return memberService.findMember(id);
    }


    @GetMapping("/member")
    public List<MemberResponseDto> getMemberList() {
        return memberService.findAllMember();
    }
}