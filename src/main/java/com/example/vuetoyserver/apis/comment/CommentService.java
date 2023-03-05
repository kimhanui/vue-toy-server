package com.example.vuetoyserver.apis.comment;

import com.example.vuetoyserver.common.PaginationVO;
import com.example.vuetoyserver.apis.member.MemberLikesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repository;


    public List<CommentVO> getList(PaginationVO vo) {
        return repository.selectCommentList(vo);
    }

    public void create(CommentVO vo) {
        repository.createComment(vo);
    }

    public void updateCommentLikes(MemberLikesDTO dto) {
        repository.updateCommentLikes(dto);
    }
}
