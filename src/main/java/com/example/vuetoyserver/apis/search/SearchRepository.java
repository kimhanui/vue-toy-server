package com.example.vuetoyserver.apis.search;

import com.example.vuetoyserver.common.PaginationVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchRepository {
    PaginationVO<SearchVO> getList(SearchVO vo);
}
