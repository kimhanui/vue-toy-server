package com.example.vuetoyserver.member;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberVO {
    private long member_sq;
    private String id;
    private String password;
    private String nickname;
    private String address;
    private String genre; // String list format
    private LocalDateTime reg_dt;
}
