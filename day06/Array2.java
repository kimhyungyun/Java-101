package day06;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        String [] menu = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++) {
            System.out.println("커피 메뉴 이름과 가격입력 [ex : 아메리카노 : 5000원] : ");
            menu[i] = sc.nextLine();
        }


        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + "번째 커피 이름 " + menu[i] + "원");
        }


        int sum = 0;


        for (int i = 0; i < menu.length; i++) {
            sum += Integer.parseInt(menu[i].split("")[1]);

        }

        double avg = (double) sum / menu.length;
        System.out.println("가격 평균 :" + avg);

    }
}
