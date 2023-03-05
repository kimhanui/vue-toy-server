package com.example.vuetoyserver.apis.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/search/v1.0")
@RestController
public class SearchController {
    @Autowired
    private SearchService service;

    @GetMapping
    public SearchVO getList(SearchVO vo){
        return service.getList(vo);
    }
}
