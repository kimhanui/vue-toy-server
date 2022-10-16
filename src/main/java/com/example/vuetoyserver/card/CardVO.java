package com.example.vuetoyserver.card;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CardVO {
    private long card_sq;
    private String title;
    private String content;
    private String img_url;
    private int like_cnt;
    private long member_sq;
    private LocalDateTime reg_dt;
}
