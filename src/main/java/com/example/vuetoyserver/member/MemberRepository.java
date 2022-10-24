package com.example.vuetoyserver.member;

import com.example.vuetoyserver.common.PaginationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberRepository {
    MemberVO selectMember(long member_sq);

    void updateMember(MemberVO vo);

    void updatePassword(MemberDTO vo);

    void updateProfileImg(MemberVO dto);

    List<MemberDTO> selectStatistics(MemberDTO dto, PaginationVO pVO);
}
