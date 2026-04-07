package ch01;

public class OperatorTest {
    static void main() {
        // 산술 연산 => +, -, *, /, %(나머지 연산)
        System.out.println(10+10);
        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println(10.0/4);
        System.out.println(10/5); // 2가 남아서.
        System.out.println(10%5); // 나머지 0이라서
        System.out.println(10%2);


        //
        int time = 5000; // 초단위의 숫자를 입력 받았을 때 몇 시간, 몇 분, 몇 초인지 알 수 있는 프로그래밍

        int second = time % 60;
        int minute = time / 60 % 60;
        int hour = time / 60 / 60;
        System.out.println(time +"초는 "+ hour+"시간"+minute+"분 "+second+"초 입니다.");

        // ////////////////////////////////////////////////
        int a = 1;
        int b = 1;
        a = a + 1; // 여기서 a = 2가 되고
        a += 1; // 여기서 1을 더 더해서
        a++; // 이렇게 표현하면 1을 하나 더 증가시킨 것.
        int c=a++; // a를 c에 대입하는 게 우선 그래서 c=4가 되고 그 다음에 1 증가해서 a는 4 / c는 5?? 맞는지 확인 => 이걸 후위 증감 연산자 // ++은 후위 증감 연산자. 먼저 할당하고 나중에 연산
        // c = 4, a = 5

        // int c = ++a; 이건 둘 다 5
        // ++은 선위 증감 연산자 먼저 할당하고 나중에 연산
        // c = 5, a = 5

        System.out.println(a + "===" + c); // 3으로 됐음.

        a = a * 3;

        // 비교 연산(큰지 작은지 따져보는 것 / 이건 true, false만 나온다. 아까 배운 boolean과 같음?)
        int d = 5;
        int e = 3;
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d >= e); // 크거나 같다
        System.out.println(d <= e); // 작거나 같다
        System.out.println(d == e); // 같다
        System.out.println(d != e); // 다르다. !=는 not을 뜻 함. 프로그램에서 "!"는 부정을 뜻한다.

        // 논리 연산
        System.out.println( !(5 > 3) ); // !는 부정 연산 => ()안에 있는 5 > 3인 true를 ! 부정하겠다 해서 => false
        System.out.println(!true);
        System.out.println(5 > 3 || 4 > 5); // || 이걸 파이프라고 한다. 이건 OR을 뜻 함. true, false를 || 연산으로 묶으면 둘 중 하나만 참이어도 true로 판단한다. => OR연산 (합집합 표시)
        System.out.println(5 > 3 && 4 > 5); // and 연산 => 둘 다 T여야 T (교집합 표시)
        System.out.println(5 > 3 ^ 4 > 5); // xor 연산 서로 다르면 true => 다시 공부해서 확인할 것.

        // 비교 연산과 논리 연산 복합 => 아래 3개 질문에 답할 것. 이유까지 설명해서 => 다시 공부하기.
        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));



    }
}
