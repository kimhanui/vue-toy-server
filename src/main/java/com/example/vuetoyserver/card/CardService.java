package com.example.vuetoyserver.card;

import com.example.vuetoyserver.common.PaginationVO;
import com.example.vuetoyserver.member.MemberLikesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;
    public List<CardVO> getList(PaginationVO vo) {
        return repository.selectCardList(vo);
    }

    public CardVO get(long card_sq) {
        return repository.selectCard(card_sq);
    }

    public int create(CardVO vo) {
        return repository.createCard(vo);
    }

    public void updateCardLikes(MemberLikesDTO dto) {
        repository.updateCardLikes(dto);
    }
}
