package com.example.vuetoyserver.common;

import com.example.vuetoyserver.common.s3.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/* 파일 처리 */
@RestController
@RequestMapping("/common/v1.0")
public class CommonController {

    @Autowired
    private S3Service s3Service;

    @PostMapping("upload/profile")
    public String uploadProfile(MultipartFile file){
        return s3Service.uploadProfileImg(file);
    }
}
