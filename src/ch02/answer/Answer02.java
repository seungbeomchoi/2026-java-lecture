package ch02.answer;

import java.util.Scanner;

//2. Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
//2자리수 정수 입력(10~99) >> 77
//Yes! 10의 자리와 1의 자리가 같습니다.
public class Answer02 {
    static void main() {
        System.out.println("두자리 정수를 입력하세요.  ex) 87");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ten = num / 10;
        int one = num % 10;
        if (ten == one) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
    }
}
