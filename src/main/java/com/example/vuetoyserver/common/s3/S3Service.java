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

    public String upload(String bucketDir, MultipartFile multipartFile){
        try{
            setBucketDir(bucketDir);
            return upload(multipartFile);
        } catch(IOException e){
            log.debug("====Upload {} Failed::{}", bucketDir, e.getMessage());
        }
        return null;
    }

    public String uploadProfileImg(MultipartFile multipartFile){
        return upload("profile", multipartFile);
    }

    public String uploadCardImg(MultipartFile multipartFile){
        return upload("card", multipartFile);
    }

    public void delete(String key){
        delete(key);
    }
}
