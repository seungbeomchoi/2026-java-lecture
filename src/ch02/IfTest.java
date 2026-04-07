package ch02;

public class IfTest {
    static void main() { // 26.04.07.화

        int num = 3; // 여기서 3은 값이니까 "식"이 되는 것. 그리고 이건 하나의 "문"이 되는 것이다.
        if (num % 2 == 1) {
            // 여기가 실행된다.

            System.out.println("홀수입니다."); // 여기는 어떻게 계산이 돼서 홀수가 나왔는지 공부하기+이 전체 코드는 어떻게 계산되는 방식인지도 공부하기

        } else {
            System.out.println("짝수입니다."); // 여기까지 하면 이분법이 된다. => ture, false 중 하나라서.
        }

        int score = 82;
        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) { //(score > 80 && score<=90) Tip! && 연산은 앞에 부정이 오는 게 좋다 => 하나가 F면 다 F니까
            // 이렇게 만들었는데 나는 아직 저런 머리가 부족한 거 같다. 수학적, 논리적 사고를 어떻게 키울 수 있을까.
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C"); // 여기까지만 그냥 두면 B와 C가 모두 충족되니까 다 출력된다. 이럴 때 수학적인 사고와 논리적인 사고가 필요하다. 이런 것들을 해결해야 하니까.

        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        } // 업계에서 "리팩토리"과정을 거쳐서 코드의 품질을 높인다는데 이게 무슨 말인지 알아보자.
    }
}


