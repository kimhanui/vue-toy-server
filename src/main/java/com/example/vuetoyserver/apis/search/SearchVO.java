package com.example.vuetoyserver.apis.search;

import com.example.vuetoyserver.apis.card.CardVO;
import com.example.vuetoyserver.apis.member.MemberVO;
import com.example.vuetoyserver.common.PaginationVO;
import lombok.Data;

import java.util.List;

@Data
public class SearchVO {

    private String search_text;
    private int search_type; // 0:all 1:member, 2: card
    private int page;
    private int size;
    private int offset;

    private PaginationVO<MemberVO> memberList = new PaginationVO<>(null); // TODO convert to PaginationVO
    private PaginationVO<CardVO> cardList = new PaginationVO<>(null);;
//public void setMemberPagData(List<MemberVO> list){
//    memberList.setContent(list);
//}
//    public void setCardPagData(List<CardVO> list){
//        cardList.setContent(list);
//    }
    public void setMemberPagData(List<MemberVO> list, int page, int size, int total_cnt){
        memberList.setContent(list);
        memberList.update(page, size, total_cnt);
    }
    public void setCardPagData(List<CardVO> list, int page, int size, int total_cnt){
        cardList.setContent(list);
        cardList.update(page, size, total_cnt);
    }
}
