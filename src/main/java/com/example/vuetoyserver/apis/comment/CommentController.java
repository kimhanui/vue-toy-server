package com.example.vuetoyserver.apis.comment;

import com.example.vuetoyserver.apis.member.MemberLikesDTO;
import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment/v1.0")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<CommentVO> getList(PaginationVO vo){
        return commentService.getList(vo);
    }

    @PostMapping
    public void create(@RequestBody CommentVO vo){
        commentService.create(vo);
    }

    @PutMapping("/likes")
    public void updateCommentLikes(@RequestBody MemberLikesDTO dto){
        commentService.updateCommentLikes(dto);
    }
}
