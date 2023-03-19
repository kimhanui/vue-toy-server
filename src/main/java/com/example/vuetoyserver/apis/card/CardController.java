package com.example.vuetoyserver.apis.card;

import com.example.vuetoyserver.apis.member.MemberLikesDTO;
import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card/v1.0")
public class CardController {
    @Autowired
    private CardService cardService;
    @GetMapping
    public PaginationVO<CardVO> getList(CardDTO req){
        return cardService.getList(req);
    }

    @GetMapping("/{card_sq}")
    public CardVO get(@PathVariable long card_sq){
        return cardService.get(card_sq);
    }

    @PostMapping
    public int create(CardDTO dto){
        return cardService.create(dto);
    }

    @PutMapping
    public int update(CardDTO dto){
        return cardService.update(dto);
    }

    @PutMapping("/likes")
    public void cardLikes(@RequestBody MemberLikesDTO dto){
        cardService.updateCardLikes(dto);
    }
}
