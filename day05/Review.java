package day05;


import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("자신의 키를 입력하세요 : ");
//        double m = sc.nextInt();
//
//        System.out.println("자신의 몸무게를 입력하세요 : ");
//        double kg = sc.nextInt();
//        double BMI = kg / (m * m);
//
//        if (BMI >= 30){
//            System.out.println("비만 입니다.");
//        } else if (30 >= BMI && BMI > 25){
//            System.out.println("과체중 입니다");
//        } else if (25 >= BMI && BMI > 18.5){
//            System.out.println("정상체중 입니다");
//        } else {
//            System.out.println("저체중 입니다");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 아메리카노 = 4000원 2. 카페라떼 = 4500원 3. 카푸치노 = 5000원 : ");
        int coffeeNumber = sc.nextInt();

        System.out.println("수량을 입력 하세요 : ");
        int amountNumber = sc.nextInt();

        System.out.println("멤버쉽 입니까? (1번 : 예 2번 : 아니요)");
        int memberShip = sc.nextInt();
        boolean isMember = memberShip ==1;

        int coffeePrice = 0;
        switch (coffeeNumber) {
            case 1:
                coffeePrice = 4000;
                break;
            case 2:
                coffeePrice = 4500;
                break;
            case 3:
                coffeePrice = 5000;
                break;
            default:
                break;
        }
        double totalPrice = coffeePrice * amountNumber * (isMember ? 0.9 : 1);
        System.out.println("총 금액 : " + totalPrice);











    }
}
