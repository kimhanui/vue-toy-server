package com.example.vuetoyserver.card;

import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card/v1.0")
public class CardController {
    @Autowired
    private CardService cardService;

    @GetMapping
    public List<CardVO> getList(PaginationVO vo){
        return cardService.getList(vo);
    }

    @GetMapping("/{card_sq}")
    public CardVO get(@PathVariable long card_sq){
        return cardService.get(card_sq);
    }

    @PostMapping
    public void create(@RequestBody CardVO vo){
        cardService.create(vo);
    }
}
