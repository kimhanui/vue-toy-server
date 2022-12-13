drop table IF EXISTS tb_member;
drop table IF EXISTS tb_member_book;
drop table IF EXISTS tb_card;
drop table IF EXISTS tb_comment;
drop table IF EXISTS tb_likes;

create table tb_member
(
    member_sq       bigint auto_increment primary key  not null comment '유저 pk',
    id              varchar(255)                       not null comment 'id',
    password        varchar(255)                       not null comment '비밀번호',
    nickname        varchar(255)                       not null comment '닉네임',
    address         varchar(255)                       null comment '주소',
    genre           varchar(255)                       null comment '선호 장르',
    profile_img_url varchar(1024)                      null comment '프로필 이미지',
    reg_dt          DATETIME default CURRENT_TIMESTAMP not null comment '생성일'
) comment '회원 정보';

create table tb_member_book
(
    book_sq      bigint auto_increment primary key  not null comment '책 sq',
    book_info    varchar(1024)                      not null comment '책 정보',
    book_status  tinyint  default 0                 not null comment '상태(0: 읽고싶은책, 1: 읽은책, 2:추천한책, 4:읽어야하는책)',
    read_end_dt  DATETIME                           null comment '완독일',
    read_reason  varchar(255)                       null comment '읽은 이유',
    recommend_yn tinyint  default 0                 null comment '추천 여부',
    member_sq    bigint                             not null comment '유저 pk',
    reg_dt       DATETIME default CURRENT_TIMESTAMP not null comment '생성일'
) comment '회원 책 관리';

create table tb_card
(
    card_sq   bigint auto_increment primary key  not null,
    title     varchar(255)                       not null comment '제목',
    content   varchar(1024)                      not null comment '내용',
    img_url   varchar(1024)                      null comment '이미지 링크 주소',
    like_cnt  int      default 0                 not null comment '추천 수',
    member_sq bigint                             not null comment '작성자 pk',
    book_sq   bigint                             null comment '책 pk',
    reg_dt    DATETIME default CURRENT_TIMESTAMP not null comment '생성일'
) comment '카드 정보';

create table tb_comment
(
    comment_sq bigint auto_increment primary key  not null,
    content    varchar(255)                       not null comment '내용',
    like_cnt   int      default 0                 not null comment '추천 수',
    card_sq    bigint                             not null comment '카드 pk',
    member_sq  bigint                             not null comment '작성자 pk',
    reg_dt     DATETIME default CURRENT_TIMESTAMP not null comment '생성일'
) comment '코멘트 정보';

create table tb_likes
(
    member_sq  bigint                             not null,
    card_sq    bigint                             not null,
    comment_sq bigint                             not null,
    likes      tinyint  default 0                 not null,
    upd_dt     DATETIME default CURRENT_TIMESTAMP not null comment '수정일',
    primary key (member_sq, card_sq, comment_sq)
) comment '카드 추천 정보';

