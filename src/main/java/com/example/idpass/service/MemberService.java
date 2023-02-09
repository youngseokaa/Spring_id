package com.example.idpass.service;

import com.example.idpass.entity.Member;
import com.example.idpass.passdto.MemberResponseDto;
import com.example.idpass.repoitory.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;



@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    @Transactional (readOnly = true)
    public MemberResponseDto findMember(Long id) {

        Member member = memberRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("회원 상세 조회 실패")
        );
        MemberResponseDto memberResponseDtos = new MemberResponseDto(member);
        return memberResponseDtos;
    }

    @Transactional(readOnly = true)
    public List<MemberResponseDto> findAllMember() {
        List<MemberResponseDto> memberResponseDtos = new ArrayList<>();

        List <Member> member = memberRepository.findAll();
        for(int i= 0; i<member.size(); i++){
            memberResponseDtos.add(new MemberResponseDto(member.get(i)));
        }
        return memberResponseDtos;
    }
}