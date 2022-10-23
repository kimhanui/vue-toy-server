package com.example.vuetoyserver.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PaginationVO {
    private int page;
    private int size;
}
