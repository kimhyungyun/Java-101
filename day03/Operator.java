package day03;

public class Operator {
    public static void main(String[] args) {
        // Operator [연산자]
        // 산술 연사자
        // +, -, *, /[몫], %[나머지], ++, --

//        int a = 10;
//        a++; // 하나올리기
//        System.out.println(a);
//
//        int b = 10;
//        a--; // 하나내리기
//        System.out.println(a);

        // 비교 연산자 : 결과는 boolean
        // <, >, >=, <=, ==, !=


        // 논리 연산자:
        // && [and], || [or], ! [not]

        // && : 모두 true 이면 true
        // || : 하나라도 true 이면 true

//        boolean m = true;
//        boolean n = false;
//        System.out.println(m && n); // false
//        System.out.println(m || n); // true
//        System.out.println(!n); //true


        // 대입 연산자
        // =, +=, -=, *=, /=

//        int h = 10;
//        h += 5;
//        h *= 3;
//        h -= 20;


        // 삼항 연산자
        // 조건 ? 참 : 거짓
        int i = 10;
        int j = 20;
        String result = i > j ? "아메리카노" : "라떼";
        System.out.println(result); //라떼
    }
}
