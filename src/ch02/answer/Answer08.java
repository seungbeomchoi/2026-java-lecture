package ch02.answer;

//26.04.08.수
//8. 사칙 연산을 입력받아 계산하는 프로그램을 작성하고자 한다. 연산자는 + - * / 의 네 가지로
//   하고 피연산자는 모두 실수로 한다.
//   피연산자와 연산자는 실행 사례와 같이 빈 칸으로 분리하여 입력한다.
//   0으로 나누기 시 "0으로 나눌 수 없습니다."를 출력하고 종료한다.
//
//   연산 >>2+4
//
//   2+4의 계산 결과는 6
public class Answer08 {
    static void main() {
        // 스캐너를 따로 사용하지 않을 것임.
        double a = 0;
        double b = 5;
        double result = 0;
        String operator = "/";
        if (operator == "+") {
            result = a + b;
        } else if (operator == "-") {
            result = a - b;
        } else if (operator == "*") {
            result = a * b;
        } else {
            if (b == 0 || a == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            result = a / b;
        }
        System.out.printf("%.0f %s %.0f = %.2f", a, operator, b, result); // println과 printf의 차이 그리고 printf의 괄호 안에는 왜 %, %s, %.2f 이렇게 쓰는지 저것들이 모두 뭘 뜻하는지 공부 필요.
    }
}
