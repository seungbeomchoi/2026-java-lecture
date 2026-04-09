package ch03;

// 26.04.08.수

import java.util.Scanner;

public class BreakTest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("end를 쓰면 종료합니다.");
        while (true) {//여기가 true면 항상 참이라서 무한 루프이다. => 왜?
            System.out.println("채팅 ===> "); // 간단하게 채팅 프로그램을 만든다고 생각하고.
            String msg = scanner.nextLine(); // scanner.nextLine()는 한 줄을 인식하는 코드? => 팩트 체크
            if (msg.equals("end")) {
                break; // end를 쓰면 빠져 나갈 수 있는 통로 => 왜? 어떻게?
            }
            System.out.println(msg);
        }
        System.out.println("채팅종료");
    }
}
