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

    @Test
    @DisplayName("명언 삭제 테스트")
    void deleteWiseSayingTest() {
        Work work = new Work();
        work.register("내용1","이름1");
        work.register("내용2","이름2");

        work.deleteWiseSaying(1);
        assertThat(work.showList().get(0)).isEqualTo("2 / 내용2 / 이름2");
    }

    @Test
    @DisplayName("명언 삭제 테스트2")
    void deleteWiseSayingTest2() {
        Work work = new Work();
        work.register("내용1","이름1");
        work.register("내용2","이름2");
        work.register("내용3","이름3");
        work.register("내용4","이름4");

        work.deleteWiseSaying(1);
        assertThat(work.getWiseSayingSize()).isEqualTo(3);
    }
}