package day03;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        int year = 2024;
//        System.out.println("당신은 " + year - age + " 년생 이시군요);

        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력하세요 : ");
        int x = sc.nextInt();
        double y = 3.14;
        System.out.println("원의 넓이는 " + x * x * y + " 입니다");
    }
}
