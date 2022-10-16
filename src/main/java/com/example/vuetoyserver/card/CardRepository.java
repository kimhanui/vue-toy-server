package com.example.vuetoyserver.card;

import com.example.vuetoyserver.common.PaginationVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CardRepository {
    List<CardVO> selectList(PaginationVO vo);
}
