package com.example.vuetoyserver.member;

import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/v1.0")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/{member_sq}")
    public MemberVO get(@PathVariable long member_sq){
        return memberService.get(member_sq);
    }

    @PutMapping("/profile")
    public void updateProfile(@RequestBody MemberVO vo){
        memberService.updateProfile(vo);
    }

    @PutMapping("/password")
    public void updatePassword(@RequestBody MemberDTO dto){
        memberService.updatePassword(dto);
    }

    @PutMapping("/profile/img")
    public void updateProfileImg(MemberDTO dto){
        memberService.updateProfileImg(dto);
    }

    @GetMapping("/stat/{member_sq}")
    public List<MemberDTO> getStatistics(MemberDTO dto, PaginationVO pVO){
        return memberService.getStatistics(dto, pVO);
    }
}