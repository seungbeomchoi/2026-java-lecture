package ch02.answer;

import java.util.Scanner;

public class Answer01 {
    static void main() {
        //1. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
        //   다음 예시와 같이 출력하는 프로그램을 작성하라.
        //   ($1=1500원으로 가정) 원화를 입력하세요(단위 원) >> 3300
        //
        //   5500원은 $3.0입니다.

        System.out.println("원을 입력하면 달러로 바꿔줍니다.");
        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();
        double dollar = won / (double)1500; // 여길 반드시 (double)1500; 으로 바꿔줘야지만 제대로된 값으로 나온다는데 무슨 말인지 체크
        // System.out.println(won+"은 $"+dollar+"입니다.");
        System.out.printf("%d은 $%.3f %s",won,dollar,"입니다."); // 왜 이렇게 사용한 건지 아예 이해를 못 했으니까 이 부분 다른 곳보다 더 자세하게 공부 필요.
        //         printf   정수 / 실수 / 문자 입력할 때는 %s
    }
}
