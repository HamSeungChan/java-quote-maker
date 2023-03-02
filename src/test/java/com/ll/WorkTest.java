package com.ll;

import com.ll.domain.WiseSaying;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
class WorkTest {

    @Test
    @DisplayName("명언 등록 확인 테스트")
    void register() {
        List<WiseSaying> wiseSayings = new ArrayList<>();
        wiseSayings.add(new WiseSaying(1,"내용","이름"));
        assertThat(wiseSayings.get(0).getId()).isEqualTo(1);
        assertThat(wiseSayings.get(0).getAuthorName()).isEqualTo("이름");
        assertThat(wiseSayings.get(0).getContent()).isEqualTo("내용");
    }
}