package day03;

import java.util.Scanner;

public class StringADV {
    public static void main(String[] args) {
        String icecream = "chocolate";

        // icecream.length() << 몇글자인지 알려줌
        // icecream.charAt(3) << 0,1,2,3 번째의 알파벳을 알려줌
        // icecream.substring(0,3) << 0~2번째 까지 짤라서 돌려줌
        // icecream.contains("co") "co"를 갖는지 true/false 로 알려줌
        // icecream.indexOf("h") "h"는 몇번째인지 돌려줌 없으면 -1 돌려줌
        // icecream.equals("choco") "choco"랑 똑같은지 물어봄 true/false 로 돌려줌
        // icecream.equalsIgnoreCase("CHOCOLATE") 대소문자 상관없이 같은지 물어봄 true/false
        // icecream.toUpperCase() 대문화 시켜줌
        // icecream.toLowerCase() 소문자화 시켜줌
        // icecream.replace("a","b") "a"를 "b"로 바꿔줌
        // icecream.replaceAll("a","b") "a"를 "b"로 모두 바꿔줌
        // icecream.startsWith("choco") "choco"로 시작하니? true/false



//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("설정하실 비밀번호를 입력해주세요 : ");
//        String password = sc.next();
//
//        boolean isLengthOber8 = password.length() >= 8;
//        boolean hasExciamation = password.contains("!");
//
//        String result = password.length() >= 8 && password.contains("!") ? "비밀번호를 올바르게 설정" : "비밀번호를 다시 설정하세요";
//        System.out.println(result);


          Scanner sc = new Scanner(System.in);
          System.out.println("이메일을 입력하세요 : ");
          String mail = sc.next();

          String result = mail.contains("@") && mail.contains(".") && (mail.contains("naver") || mail.contains("gamil")) ? "올바른 형식" : "형식이 올바르지 않습니다";
          System.out.println(result);



//         Scanner sv = new Scanner(System.in);
//         System.out.println("과일 이름을 입력하세요 : ");
//         String f = sv.next();
//
//         String result1 = f.length() <= 6 ? f.toUpperCase() : f.substring(0,3);
//         System.out.println(result1);



    }
}
