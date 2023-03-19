package com.example.vuetoyserver.apis.card;

import com.example.vuetoyserver.apis.member.MemberLikesDTO;
import com.example.vuetoyserver.common.PaginationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CardRepository {
    List<CardVO> selectCardList(PaginationVO vo);

    CardVO selectCard(long card_sq);
    List<CardVO> selectCardBySearch(CardDTO dto);
    int selectCardCountBySearch(CardDTO dto);

    int createCard(CardVO vo);
    int updateCard(CardVO vo);

    void updateCardLikes(MemberLikesDTO dto);
}
