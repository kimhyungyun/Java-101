package day05;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        //for문

//        for(int i = 0; i < 5; i++) {
//            System.out.println("i는 " +i);
//            System.out.println("오늘 수요일");



//        for(int a = 0; a < 101; a++) {
//            System.out.println(a);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("숫자를 지정하세요 : ");
//        int n = sc.nextInt();
//
//        for(int i = 0; i <= n; i++) {
//            System.out.println(i);
//

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 지정하세요 : ");
        int n = sc.nextInt();

        System.out.println("두번째 숫자를 지정하세요 : ");
        int m = sc.nextInt();

        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}
