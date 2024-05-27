package day06;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] math_score = new int[10];
        for (int i = 0; i < math_score.length; i++) {
            System.out.println(i + 1 + "번째 학생 수학점수 입력 : ");
            math_score[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < math_score.length; i++) {
            System.out.println(i + 1 + "번째 학생 수학점수 입력 : " + math_score[i]);
            sum += math_score[i];
        }
            double avg = (double) sum / math_score.length;

        System.out.println("평균은 " + avg + " 입니다.");






    }
}
