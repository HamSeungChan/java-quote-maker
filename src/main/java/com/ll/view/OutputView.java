package com.ll.view;

public class OutputView {

    private static final String INPUT_COMMAND = "명령";
    private static final String REGISTER_MESSAGE = "%d번 명언이 삭제되었습니다.\n";

    public static void printCommandMessage() {
        System.out.println(INPUT_COMMAND);
    }

    public static void printRegisterMessage(int id) {
        System.out.printf(REGISTER_MESSAGE, id);
    }

}
