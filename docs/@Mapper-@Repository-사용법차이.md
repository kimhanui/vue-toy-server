# @Mapper-@Repository-사용법차이.md

## @Mapper  
사용 형태) repository 레이어에서 @Mapper 사용
- MyBatis 3.0부터 지원
- interface로 작성 후, 따로 implements(구현)을 하지 않는다.
- @Mapper에 작성한 메소드이름과 Mapper.xml에 작성한 Sql id는 일치해야 한다. 
- Mapper.xml의 namespace는 @Mapper의 경로를 작성해야 한다.

특징) 단순 마커 인터페이스("나는 매퍼입니다~"라고 하는 것)이지만, 이 어노테이션을 달아야 `Mybatis 스프링 연동모듈`이 알아서 mapper를 스캔하고 xml과 연동 됨.
```java
@Mapper
public class MemberRepository{
    public MemberVO selectMember(long id);
}
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.example.vuetoyserver.apis.member.MemberRepository">
<select id="selectMember" parameterType="long" resultType="com.example.vuetoyserver.apis.member.MemberVO">
    SELECT * FROM tb_member
    WHERE MEMBER_SQ=#{member_sq}
</select>
</mapper>
```
@Mapper 달아주면, 해당 패키지 경로를 namespace로 하는 xml과 매핑됨.

## @MapperScan (추가함)
사용 형태) DB 설정 클래스 파일에 @MapperScan(value="매퍼 인터페이스 경로")를 추가

**사용법1 - @MapperScan만 사용**  
- @MapperScan을 해준다면 딱 그 패키지 아래에 있는 모든 인터페이스를 매퍼로 인식해서 등록한다
```java
@Configuration
@MapperScan(value = {"com.test","com.board"})  // 해당 위치에 있는 @Mapper가 붙은 인터페이스를 스캔하고 실제 SQL문과 연결되게 해줌
public class DBConfig {
    // 각종 빈 설정
}

----
package com.test.api.mapper;

@Component
@MapperScan
public interface TestMapper {
    Test test() throws Exception;
}
```

**사용법2 - @MapperScan, @Mapper 사용**
```java
@MapperScan(basePackages = {"com.example.infra.db.*"}, annotationClass = Mapper.class)
로 등록

---
package com.test.api.mapper;

@Mapper
public interface TestMapper {
    Test test() throws Exception;
}
```

## @Repository
사용 형태) repository 레이어에서 @Repository 사용
- 빈으로 등록되므로 DI를 사용할 수 있음.
- **내부에 SqlSession을 사용해야 sql 호출 가능함.**
- 원랜 Mapper의 namespace에 패키지명을 포함한 주소를 써야하지만, @Repository의 value 값을 지정해주면 namespace에 해당 value값을 써주면 되는 간편함이 있음
  ```
  @Repository("test") // namespace와 연결됨
  public void MemberRepository {
    private SqlSession sql;    // SqlSession 사용
    List<MemberVO> selectMember();
  }
  
  <mapper namespace="test">
  ...
  </mapper>
  ```

## SQL 작성 위치 (2가지)
  1. interface에 작성
     ```java
     @Mapper
     public interface XXXRepository{
        @Select("select * from FooTable")  // 여기에 작성
        List<Foo> getFooList();
     }
     ```
  2. XML에 작성
     - 이 경우 application.yml에서 mapper 설정이 필요하다.
       ```
       # sql작성한 위치
       mybatis:
         mapper-locations: mapper/*.xml
       ```
## 추가
- 어떻게 @Mapper는 SqlSession 사용 안 해도 매핑되는지?
  - `Mybatis 스프링 연동모듈`이 @Mapper를 자동스캔함 & 미리 등록된 SqlSessionTemplate을 사용했기 때문
  - @Repository은 빈으로 등록까진 되지만, Mapper를 사용하는지는 몰라서 개발자가 직접 SqlSession사용해서 xml과 연결되도록 지정하는 것
  - 참고)`MyBatis-Spring-Boot-Starter`패키지에서 수행하는 아래 스텝 중 (4) 때문임.
      1) `DataSource`를 자동 감지함.
      2) `SqlSessionFactoryBean`을 사용해서 `DataSource`을 입력으로하는 `SqlSessionFactory`인스턴스를 생성하고 등록함. 
      3) `SqlSessionFactory`에서 `SqlSessionTemplate`인스턴스를 생성하고 등록함.  
      4) **매퍼를 자동 스캔하고, 매퍼를 `SqlSessionTemplate`에 연결시키고, Spring 컨텍스트에 빈으로 등록해서 다른 빈(@Service)에 주입할 수 있도록 함.** -> 이유

@Mapper 사용시 @MapperScan을 같이 쓰지 않았는데도 매퍼 스캔이 되는 이유?
  - 이유: **MyBatis-Spring-Boot-Starter는 기본적으로 @Mapper주석이 표시된 매퍼를 검색함.**
  - 만약, 따로 사용자 지정 주석 또는 마커 인터페이스를 지정할 경우는 @MapperScan 명시적으로 사용 필요

참고
- [스프링 부트 mapper 자동설정 패키지](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/#quick-setup)
- [스프링 부트 mapper 설정 방벙 예제](https://gaemi606.tistory.com/entry/Spring-Boot-MyBatis-%EC%97%B0%EB%8F%99)
