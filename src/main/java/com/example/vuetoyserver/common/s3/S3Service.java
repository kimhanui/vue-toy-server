package com.example.vuetoyserver.common.s3;

import com.amazonaws.services.s3.AmazonS3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@Service
public class S3Service extends S3Uploader {

    @Autowired
    public S3Service(AmazonS3 amazonS3) {
        super(amazonS3);
    }

    public String uploadProfileImg(MultipartFile multipartFile){
        try{
            setBucketDir("profile");
            return upload(multipartFile);
        } catch(IOException e){
            log.debug("====Upload Profile Failed::"+e.getMessage());
        }
        return null;
    }

    public String uploadCardImg(MultipartFile multipartFile){
        try{
            setBucketDir("card");
            return upload(multipartFile);
        } catch(IOException e){
            log.debug("====Upload Card Failed::"+e.getMessage());
        }
        return null;
    }
}
