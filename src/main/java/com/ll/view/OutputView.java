package com.ll.view;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

public class OutputView {

    private static final String INPUT_COMMAND = "명령";
    private static final String REGISTER_MESSAGE = "%d번 명언이 등록되었습니다.\n";
    private static final String DELETE_MESSAGE = "%d번 명언이 삭제되었습니다.\n";
    private static final String NOT_DELETE_MESSAGE = "%d번 명언은 존재하지 않습니다.\n";
    public static void printCommandMessage() {
        System.out.println(INPUT_COMMAND);
    }

    public static void printRegisterMessage(int id) {
        System.out.printf(REGISTER_MESSAGE, id);
    }

    public static void printList(List<String> wiseSayings){
        Collections.reverse(wiseSayings);
        for(String s : wiseSayings){
            System.out.println(s);
        }
    }

    public static void printDeleteResult(Boolean deleteResult){
        if(deleteResult == true){
            System.out.println(DELETE_MESSAGE);
        }
        System.out.println(NOT_DELETE_MESSAGE);
    }
}
