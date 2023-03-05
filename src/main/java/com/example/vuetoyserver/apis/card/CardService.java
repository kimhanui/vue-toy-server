package com.example.vuetoyserver.apis.card;

import com.example.vuetoyserver.common.PaginationVO;
import com.example.vuetoyserver.common.ScrollVO;
import com.example.vuetoyserver.common.s3.S3Service;
import com.example.vuetoyserver.apis.member.MemberLikesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.example.vuetoyserver.common.utils.CommonUtils.isStringEmpty;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    @Autowired
    private S3Service s3Service;

    public ScrollVO<CardVO> getList(PaginationVO vo) {
        List<CardVO> list = repository.selectCardList(vo);
        return new ScrollVO<>(list, vo.getSize());
    }

    public CardVO get(long card_sq) {
        return repository.selectCard(card_sq);
    }

    public int create(CardDTO dto) {
        uploadImgAndDeleteIfExist(dto);
        return repository.createCard(dto);
    }

    public int update(CardDTO dto){
        CardVO vo = repository.selectCard(dto.getCard_sq());
        dto.setImg_url(vo.getImg_url());

        uploadImgAndDeleteIfExist(dto);
        return repository.updateCard(dto);
    }

    private void uploadImgAndDeleteIfExist(CardDTO dto){
        List<MultipartFile> files = dto.getFiles();
        if(files != null && !files.isEmpty()) {
            if(!isStringEmpty(dto.getImg_url())) {
                /* TODO: s3 deletion */
            }
            String fileName = s3Service.uploadCardImg(files.get(0));
            dto.setImg_url(fileName);
        }
    }
    public void updateCardLikes(MemberLikesDTO dto) {
        repository.updateCardLikes(dto);
    }
}
