package com.example.vuetoyserver.apis.member;

import com.example.vuetoyserver.common.PaginationVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface MemberRepository {
    MemberVO selectMember(long member_sq);
    List<MemberVO> selectMemberBySearch(MemberDTO dto);
    void updateMember(MemberVO vo);

    void updatePassword(MemberDTO vo);

    void updateProfileImg(MemberVO dto);

    List<MemberDTO> selectStatistics(MemberDTO dto, PaginationVO pVO);
}
