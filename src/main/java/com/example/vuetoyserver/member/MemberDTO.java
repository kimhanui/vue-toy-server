package com.example.vuetoyserver.member;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

@Getter
public class MemberDTO extends MemberVO{
    private String originalPw;
    private String newPw;
    private String retryPw;
    private MultipartFile file;
    private int searchType;
}
