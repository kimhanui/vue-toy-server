package com.example.vuetoyserver.common;

import lombok.Data;

import java.util.List;

@Data
public class ScrollVO<T> {
    private List<T> content;
    private int size;
//    private boolean has_next;

    public ScrollVO(List<T> content, int size) {
        this.content = content;
        this.size = size;
    }
}
