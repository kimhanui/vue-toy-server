package com.example.vuetoyserver.apis.member;

import com.example.vuetoyserver.apis.card.CardVO;
import com.example.vuetoyserver.apis.comment.CommentVO;
import lombok.Data;

/* Card, Content 추천 */
@Data
public class MemberLikesDTO {

    private CommentVO commentVO;
    private CardVO cardVO;
    private MemberVO memberVO;
    private boolean likes;
}
