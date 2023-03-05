package com.example.vuetoyserver.apis.card;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class CardDTO extends CardVO{
    private List<MultipartFile> files;

    private int page;
    private int size;
    private int offset;
}
