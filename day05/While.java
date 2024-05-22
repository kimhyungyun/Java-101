package day05;

import day02.Scan;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//
//        int a = 0;
//
//        while(a<5){
//            System.out.println("수업 언제 끝남");
//

        //  1번
        //  a++;

        //  2번
        //  a++;
        //  if(a==7) break;
//    }
        System.out.println("사칙연산 프로그램 시작");
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("첫번째 정수를 입력하세요 : ");
            int f = sc.nextInt();

            System.out.println("두번째 정수를 입력하세요 : ");
            int s = sc.nextInt();

            System.out.println("원하는 결과를 입력하세요 : 0. 프로그램 종료 1. 더하기 프로그램, 2. 빼기 프로그램 3. 곱셈 프로그램 4. 제곱 프로그램 5. 나누기 프로그램 6. 나머지 프로그램");
            int R = sc.nextInt();
            boolean isSystemOff = false;


            switch (R) {
                case 0:
                    isSystemOff = ture;
                    break;

                case 1:
                    int R = f + s;
                    System.out.println(" 합: " + R);
                    break;

                case 2:
                    R = f - (s);
                    System.out.println("차 : " + R);

                case 3:
                    R = f * s;
                    System.out.println("곱 : " + R);

                case 4:
                    R = f;
                    for (int i = 1; i < s; i++);{
                        R = R * f;
                }
                case 5:
                    R = f / s;
                    System.out.println("나누기 : " + R);

                case 6:
                    R = f % s;
                    System.out.println("나머지 : " + R);

                    if(isSystemOff);


            }

        }

    }
}
