package com.example.vuetoyserver.apis.comment;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class CommentVO {
    private long comment_sq;
    private String content;
    private int like_cnt;
    private long card_sq;
    private long member_sq;
    private LocalDateTime reg_dt;
}
