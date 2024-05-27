package day06;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String[] emails = new String[3];

        for (int i = 0; i < emails.length; i++) {
            System.out.print(i + " 번째 이메일 주소를 입력 하세요 : ");
            String email = sc.nextLine();
            emails[i] = (email.split("@")[0]);

        }
        for (int i = 0; i < emails.length; i++) {
            System.out.println(i + " 번째 이메일 아이디 : " + emails[i]);
        }
    }
}
