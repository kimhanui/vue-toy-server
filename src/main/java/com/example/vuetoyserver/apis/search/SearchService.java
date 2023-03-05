package com.example.vuetoyserver.apis.search;

import com.example.vuetoyserver.apis.card.CardDTO;
import com.example.vuetoyserver.apis.card.CardRepository;
import com.example.vuetoyserver.apis.card.CardVO;
import com.example.vuetoyserver.apis.member.MemberDTO;
import com.example.vuetoyserver.apis.member.MemberRepository;
import com.example.vuetoyserver.apis.member.MemberVO;
import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CardRepository cardRepository;

    public SearchVO getList(SearchVO vo) {
        List<MemberVO> members = null;
        List<CardVO> cards = null;
        int size = vo.getSize();
        int offset = vo.getPage() * vo.getSize();

        SearchVO result = new SearchVO();
        if(vo.getSearch_type() == 0 || vo.getSearch_type() == 1) {
            MemberDTO memberDTO = new MemberDTO();
            memberDTO.setSize(size);
            memberDTO.setOffset(offset);
            memberDTO.setNickname(vo.getSearch_text());
            members = memberRepository.selectMemberBySearch(memberDTO);

            result.setMemberPagData(members, vo.getPage(), size, 100);
            // TODO add - totalPage, totalCnt set

        }
        if(vo.getSearch_type() == 0 || vo.getSearch_type() == 2) {
            CardDTO cardDTO = new CardDTO();
            cardDTO.setSize(size);
            cardDTO.setOffset(offset);
            cardDTO.setTitle(vo.getSearch_text());
            cards = cardRepository.selectCardBySearch(cardDTO);
            result.setCardPagData(cards, vo.getPage(), size, 100);
            // TODO add - totalPage, totalCnt set
        }


        result.setSearch_text(vo.getSearch_text());

        return result;
    }
}
