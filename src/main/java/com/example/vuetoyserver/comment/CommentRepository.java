package com.example.vuetoyserver.comment;

import com.example.vuetoyserver.common.PaginationVO;
import com.example.vuetoyserver.member.MemberLikesDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentRepository {
    public List<CommentVO> selectCommentList(PaginationVO vo);

    public void createComment(CommentVO vo);

    public void updateCommentLikes(MemberLikesDTO dto);
}
