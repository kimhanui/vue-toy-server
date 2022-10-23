package com.example.vuetoyserver.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
public class MemberDTO extends MemberVO{
    private String originalPw;
    private String newPw;
    private String retryPw;
    private MultipartFile file;
    private int searchType;
}
