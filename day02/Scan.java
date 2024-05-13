package day02;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {


//        Scanner b = new Scanner(System.in);
//        System.out.println("프로그램 시작!");
//        String text = b.next();
//        System.out.println("입력한 글은 " + text);

//        Scanner T = new Scanner(System.in);
//        System.out.println("내용을 입력하세요 :");
//        String O = T.next();
//        System.out.println("입력 내용 : " + O);

//        -------------------------------------------------

//        Scanner a = new Scanner(System.in);
//        System.out.println("당신의 이름은 ?");
//        String name = a.next();
//        System.out.println("이름 : " + name);
//
//        Scanner b = new Scanner(System.in);
//        System.out.println("당신의 나이는 ?");
//        String age = b.next();
//        System.out.println("나이 : " + age);
//
//        Scanner c = new Scanner(System.in);
//        System.out.println("당신의 mbti는 ?");
//        String mbti = c.next();
//        System.out.println("mbti : " + mbti);
//
//        System.out.println("당신의 이름은 " + name + "나이는 " + age + "mbti는 " + mbti);

//         -------------------------------------------------

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력");
        int first = sc.nextInt();

        System.out.println("두 번째 정수 입력");
        int second = sc.nextInt();

        System.out.println("두 수의 합 : " + (first + second) );
        System.out.println("두 수의 차 : " + (first - second) );
        System.out.println("두 수의 곱 : " + first * second);
        System.out.println("첫번째 수의 제곱 : " + first * first);
        System.out.println("두번째 수의 제곱 : " +  second * second );

    }
}
