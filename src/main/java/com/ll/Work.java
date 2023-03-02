package com.ll;

import com.ll.domain.WiseSaying;

import java.util.ArrayList;
import java.util.List;

class Work {

    private static final int ID_INIT = 1;

    private List<WiseSaying> wiseSayings;
    private int id = ID_INIT;

    Work() {
        wiseSayings = new ArrayList<>();
    }

    public void register(String content, String authorName) {
        wiseSayings.add(new WiseSaying(id, content, authorName));
        id++;
    }
}