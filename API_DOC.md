# API DOC

## Main Page
### 카드 리스트 조회(페이지네이션)
```
- GET
- /card/v1.0
```
param:

| Name | Type  | Desc          |
|------|-------|---------------|
| page | int   | 페이지네이션 페이지 번호 |
| size | int   | 페이지네이션 단위 사이즈 |

### 카드 하나 조회
```
- GET
- /card/v1.0/{card_sq}
```
param:

| Name    | Type  | Desc      |
|---------|-------|-----------|
| card_sq | int   | 컨텐츠 카드 번호 |

### 카드 생성
```
- POST
- /card/v1.0
```
param: **(body)**

| Name      | Type      | Desc    |
|-----------|-----------|---------|
| member_sq | int       | 회원번호    |
| title     | String    | 제목      |
| content   | String    | 내용      |
| file      | Multipart | 이미지 파일  |

## My Page

### 내 기본 정보 조회
```
- GET
- /member/v1.0/{member_sq}
```
param:

| Name      | Type | Desc |
|-----------|------|------|
| member_sq | int  | 회원번호 |

### 기본 정보 수정
```
- PUT
- /member/v1.0/profile
```
param: **(body)**

| Name      | Type     | Desc |
|-----------|----------|------|
| member_sq | int      | 회원번호 |
| nickname  | String   | 닉네임  |
| address   | String   | 주소   |
| genre     | [String] | 선호장르 |

### 비밀번호 수정
```
- PUT
- /member/v1.0/password
```
param: **(body)**

| Name        | Type     | Desc      |
|-------------|----------|-----------|
| member_sq   | int      | 회원번호      |
| original_pw | String   | 변경 전 비밀번호 |
| new_pw      | String   | 변경할 비밀번호  |
| retry_pw    | String   | 재입력한 비밀번호 |

### 프로필 사진 수정
```
- PUT
- /member/v1.0/profile/img
```
param: **(multipart/form-data)**

| Name      | Type      | Desc   |
|-----------|-----------|--------|
| member_sq | int       | 회원번호   |
| file      | Multipart | 이미지 파일 |

### 내 통계 정보 조회 (페이지네이션)
```
- GET
- /member/v1.0/statics/{member_sq}
```
param:

| Name      | Type | Desc                                                  |
|-----------|------|-------------------------------------------------------|
| member_sq | int  | 회원번호 |
| type      | int  | 조회할 통계 타입<br/>(0:읽은 책, 1:추천한 책, 2:읽고 싶은 책, 3:읽어야하는 책) |
| page | int   | 페이지네이션 페이지 번호 |
| size | int   | 페이지네이션 단위 사이즈 |


