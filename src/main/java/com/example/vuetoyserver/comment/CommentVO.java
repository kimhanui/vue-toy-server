package com.example.vuetoyserver.comment;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentVO {
    private long comment_sq;
    private String content;
    private int like_cnt;
    private long card_sq;
    private long member_sq;
    private LocalDateTime reg_dt;
}
