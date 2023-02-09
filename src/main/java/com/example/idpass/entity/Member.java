package com.example.idpass.entity;


import com.example.idpass.passdto.MemberResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pw;

    @Column(nullable = false)
    private String name;

    public Member(MemberResponseDto memberResponseDto){
        this.name = memberResponseDto.getName();
        this.email = memberResponseDto.getEmail();
        this.pw = memberResponseDto.getPw();
    }


}
