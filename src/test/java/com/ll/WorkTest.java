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
    void registerTest() {

        Work work = new Work();
        work.register("내용","이름");
        assertThat(1).isEqualTo(work.getWiseSayingSize());
    }

    @Test
    @DisplayName("명언 리스트 출력 테스트")
    void showListTest() {
       Work work = new Work();
       work.register("내용","이름");
       assertThat(work.showList().get(0)).isEqualTo("1 / 내용 / 이름");
    }
}