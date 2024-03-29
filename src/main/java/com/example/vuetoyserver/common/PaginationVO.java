package com.example.vuetoyserver.common;

import lombok.Data;

import java.util.List;

@Data
public class PaginationVO<T> {
    private List<T> content;
    private int size;
    private int page; // start from 0
    private int total_cnt;
    private int total_page; // start from 0

    public PaginationVO(List<T> content){
        this.content = content;
    }

    public PaginationVO(List<T> content, int page, int size, int total_cnt){
        this.content = content;
        this.update(page, size, total_cnt);
    }

    public void update(int page, int size, int total_cnt){
        this.page = page;
        this.size = size;
        this.total_cnt = total_cnt;
        setTotal_page();
    }
    void setTotal_page(){
        if(this.size > 0) {
            this.total_page = (int) Math.ceil((double) total_cnt / size) - 1;
        }
    }
}
