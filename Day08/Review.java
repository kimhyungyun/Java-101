package Day08;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[10];
        int movieCount = 0;
//        movies[movieCount++] = new Movie("IT코리아",8000);



        while (true) {
            System.out.println("cgv 판매 프로그램");
            System.out.println("1.영화구매 2.음료 구매 3. 영화추가 4. 음료추가 5. 종료");
            int codeNumber = sc.nextInt();

            switch (codeNumber){
                case 1:
                    System.out.println("영화 구매");
                    for (int i=0; i<movieCount; i++){
//                        System.out.println(i+"번째 " + movies[i].name + " " + movies[i].price);
                    }

                case 2:
                    System.out.println("번호 선택:");
                    int movieNumber = sc.nextInt();
                    System.out.println("몇명입니까 : ");
                    int people = sc.nextInt();
//                    System.out.println(movies[movieNumber].name + "영화가" + people+ "개 티켓 판매 완료");
//                    System.out.println(movies[movieNumber].price * people + "원");
                    break;

                case 3:
                    System.out.println("영화 이름 입력:");
                    String movieName = sc.nextLine();
                    System.out.println("영화 가격 입력:");
                    int moviePrice = sc.nextInt();
//                    movies[movieCount++] = new Movie(movieName,moviePrice);
                    System.out.println("등록 완료!");
            }

        }
    }
}
