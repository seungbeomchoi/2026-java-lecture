package ch02;

import java.util.Scanner; // Ctrl을 누른 상태로 좌측에 Scanner을 누르면 Scanner.java로 이동하게 된다.
// External Libraries - java.base - java - util
public class IfTest02 {
    static void main() { // 26.04.07.화 여기서 오늘 scanner라는 기능 처음 배움. if, else, if else?도 처음 배웠다.
        // 변수 2개 -> year score 둘 다 int(정수)타입으로 만든다. 합격, 불합격을 구할 것
        // score가 60점 이상이면 pass
        // but, 4학년 이상은 70점 이상이면 합격
        Scanner scanner = new Scanner(System.in); // class가 우리가 상상하는 존재라고 예를 들면 new가 그걸 현실로 만들어 준다?라고 하셨음(무슨 얘기?)
        // 타입  변수명    new를 통해서 생성(이 순간 메모리에 올라 온다.) => 프로그램 하나 동작시키는 것과 같은 것이다.(무슨 얘기인지 공부하자)
        // class == object(instance) -> 이게 무슨 말일까?
        // Scanner은 JAVA가 미리 만들어 놓은 객체. / 기본 타입을 제외한 것은 다 참조 타입. 그런 것들은 다 앞에 new를 통해서 생성자를 불러줘야 한다? => 이게 무슨 얘기?
        // External Libraries에 java.base => 이건 왜 말씀하시다가 말았을까? 공부하기

        System.out.println("학년을 입력하세요");
        int year = scanner.nextInt();// 여러가지 scanner의 함수에서 우리는 netInt()라는 함수를 사용하고 있는 것이다. => 그것들을 모아 놓은 게 External Libraries있는 것이다.
        // External Libraries 이걸 라이브러리라고 한다.
        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();

        if (year >= 4) {
            if (score >= 70) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        } else {
            if (score >= 60) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
    }

//      여기가 내 답 => 왜 이렇게 됐는지 다시 공부할 것.
//        int year = 4;
//
//        int score = 86;
//
//        if (score > 90) {
//            System.out.println("합격");
//        } else if (score > 80) {
//            System.out.println("합격");
//        } else if (year >= 70) {
//            System.out.println("4학년 합격");
//        }
//        else if (score > 70) {
//            System.out.println("합격");
//        } else if (score > 60) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }
//    }
}

