package com.example.vuetoyserver.apis.member;

import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/v1.0")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping
    public PaginationVO<MemberVO>getList(MemberDTO req){
        return memberService.getList(req);
    }
    @GetMapping("/{member_sq}")
    public MemberVO get(@PathVariable long member_sq){
        return memberService.get(member_sq);
    }

    @PutMapping("/profile")
    public void updateMember(MemberVO vo){
        memberService.updateMember(vo);
    }

    @PutMapping("/password")
    public void updatePassword(@RequestBody MemberDTO dto){
        memberService.updatePassword(dto);
    }

    @PostMapping("/profile/img")
    public void updateProfileImg(MemberDTO dto){
        memberService.updateProfileImg(dto);
    }

    @GetMapping("/stat/{member_sq}")
    public List<MemberDTO> getStatistics(MemberDTO dto, PaginationVO pVO){
        return memberService.getStatistics(dto, pVO);
    }
}
