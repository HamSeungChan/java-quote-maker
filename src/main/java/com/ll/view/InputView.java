package com.ll.view;

import java.util.Scanner;

public class InputView {

   private static Scanner sc = new Scanner(System.in);
    public static String inputCommand(){
        OutputView.printCommandMessage();
        return sc.nextLine();
    }


}
