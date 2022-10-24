package com.example.vuetoyserver.member;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class MemberDTO extends MemberVO{
    private String originalPw;
    private String newPw;
    private String retryPw;
    private MultipartFile file;
    private int searchType;
}
