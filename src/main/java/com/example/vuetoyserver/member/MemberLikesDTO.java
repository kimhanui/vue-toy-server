package com.example.vuetoyserver.member;

import com.example.vuetoyserver.card.CardVO;
import com.example.vuetoyserver.comment.CommentVO;
import lombok.Data;

/* Card, Content 추천 */
@Data
public class MemberLikesDTO {

    private CommentVO commentVO;
    private CardVO cardVO;
    private MemberVO memberVO;
    private boolean likes;
}
