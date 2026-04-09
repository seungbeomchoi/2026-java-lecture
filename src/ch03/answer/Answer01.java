package ch03.answer;

// 26.04.08.수 - 마지막 시간.
// 1. 1부터 10까지 출력하되, 짝수만 출력하는 프로그램을 작성하시오.
public class Answer01 {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) continue; // 한 줄이면 이렇게 중괄호 없이 줄여서 많이 쓴다.
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}

/*
강사님 코드 => 내가 따라서 타이핑 한 것과 같은지 확인
코드에 정답은 없다고 하셨음. 어떻게 짜도 아래와 같이 같은 값이 나올 수 있다는 얘기인가?

//1. 1부터 10까지 출력하되, 짝수만 출력하는 프로그램을 작성하시오.
public class Answer01 {
    static void main() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }
        for (int i = 0; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}

 */
