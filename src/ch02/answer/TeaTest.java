package ch02.answer;

import java.util.Scanner;

public class TeaTest {
    static void main() {
        // 1. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
        //   다음 예시와 같이 출력하는 프로그램을 작성하라.
        //   ($1=1500원으로 가정) 원화를 입력하세요(단위 원) >> 3300
        //   5500원은 $3.0입니다.

        Scanner scanner = new Scanner(System.in);
        System.out.println("원화를 입력하세요.(단위 원) : ");
        int won = scanner.nextInt();
        double dollar = won / 1500;

        System.out.println(won + "원은 $" + dollar + "입니다.");

        //2. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
        //	 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
        //	 2자리수 정수 입력(10~99) >> 77
        //
        //  Yes! 10의 자리와 1의 자리가 같습니다.

        System.out.println("2자리수 정수 입력(10~99) : ");
        int num = scanner.nextInt();

        int ten = num / 10;
        int one = num % 10;

        if (num < 10 || num > 99) {
            System.out.println("2자리 정수가 아닙니다.");
        } else if (ten == one) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }


    }
}
