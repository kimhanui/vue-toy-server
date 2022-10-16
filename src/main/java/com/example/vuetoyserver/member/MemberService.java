package com.example.vuetoyserver.member;

import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public MemberVO get(long member_sq) {
        return null;
    }

    public void updateProfile(MemberVO vo) {

    }

    public void updatePassword(MemberDTO vo) {
    }

    public void updateProfileImg(MemberDTO dto) {

    }

    public List<MemberDTO> getStatistics(MemberDTO dto, PaginationVO pVO) {
        return null;
    }
}
