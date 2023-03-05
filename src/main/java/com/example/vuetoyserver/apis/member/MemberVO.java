package com.example.vuetoyserver.apis.member;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MemberVO {
    private long member_sq;
    private String id;
    private String password;
    private String nickname;
    private String address;
    private String genre; // String list format
    private String profile_img_url;
    private LocalDateTime reg_dt;
}
