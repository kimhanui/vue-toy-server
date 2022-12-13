# Vue-Toy-Server

## 환경구성
* application-s3.yml 생성 (위치: ./src/main/resources
  )
```aidl
cloud:
  aws:
    s3:
      bucket: ${bucket_name}
    credentials:
      accessKey: ${accessKey}
      secretKey: ${secretKey}
    region:
      static: ${region}
      auto: false
    stack:
      auto: false
```