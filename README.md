# Vue-Toy-Server

## 환경구성
* mysql 도커 컨테이너로 실행
```aidl
docker run --name mysql -e MYSQL_ROOT_PASSWORD=${passsword} -d -p 3306:3306 mysql:latest
```
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