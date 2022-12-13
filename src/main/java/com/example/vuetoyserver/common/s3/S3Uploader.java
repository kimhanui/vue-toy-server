package com.example.vuetoyserver.common.s3;


import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Component
public class S3Uploader {
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;
    private String dir;
    private final AmazonS3 amazonS3;

    String upload(MultipartFile multipartFile) throws IOException {
        String s3FileName = UUID.randomUUID() + "_" + multipartFile.getOriginalFilename();

        ObjectMetadata objMeta = new ObjectMetadata();
        objMeta.setContentLength(multipartFile.getInputStream().available());
        objMeta.setContentType(multipartFile.getContentType()); // 강제 다운로드가 아닌 브라우저에서 보기위함.

        amazonS3.putObject(getBucketDir(), s3FileName, multipartFile.getInputStream(), objMeta);

        return amazonS3.getUrl(getBucketDir(), s3FileName).toString();
    }
     String getBucketDir(){
        return bucket + File.separator + dir;
    }
     void setBucketDir(String dir){
        this.dir = dir;
    }
}

