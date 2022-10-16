package com.example.vuetoyserver.card;

import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;
    public List<CardVO> getList(PaginationVO vo) {
        return repository.selectList(vo);
    }

    public CardVO get(long card_sq) {
        return null;
    }

    public void create(CardVO vo) {

    }
}
