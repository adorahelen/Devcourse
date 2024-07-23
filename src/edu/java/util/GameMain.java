package edu.java.util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GameMain {
    private Scanner scan;

    public GameMain() {
        scan = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("ㅁㅁㅁㅁㅁㅁ JAVA GAME CENTER ㅁㅁㅁㅁㅁㅁ");
        System.out.println("    1. 가위 바위 보");
        System.out.println("    2. 야구 게임");
        System.out.println("    3. 종료 ");
        System.out.println("--------------------------------------");
        System.out.print(">> 선택 : ");
    }

    public void gawibawibo(){
        System.out.println();
        System.out.println(">> 컴퓨터와 가위 바위 보!!!!");
        System.out.println(">> 가위(0), 바위(1), 보(2) 중 하나를 선택하세요. ");
        System.out.print(">> 선택 : ");
    }

    public void baseball(){
        System.out.println();
        System.out.println(">> 자바 야구 게임!!!!!");
        System.out.println(">> 준비 중입니다.........");
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
