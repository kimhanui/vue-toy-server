package com.example.vuetoyserver.member;

import com.example.vuetoyserver.common.PaginationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    public MemberVO get(long member_sq) {
        return repository.selectMember(member_sq);
    }

    public void updateMember(MemberVO vo) {
        repository.updateMember(vo);
    }

    public void updatePassword(MemberDTO vo) {
        repository.updatePassword(vo);
    }

    public void updateProfileImg(MemberDTO dto) {
        repository.updateProfileImg(dto);
    }

    public List<MemberDTO> getStatistics(MemberDTO dto, PaginationVO pVO) {
        return repository.selectStatistics(dto, pVO);
    }
}
