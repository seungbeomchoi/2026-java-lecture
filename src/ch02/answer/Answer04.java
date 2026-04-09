package ch02.answer;

//4. Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라.
//   평균값을 구하는 것이 아님에 주의
//
//	 정수 3개 입력 >> 20 100 33
//	 중간 값은 33
//26.04.08.수
public class Answer04 {
    static void main() {
        // 원래 스캐너로 받아야 하는데 그냥 해보겠다.
        int a = 20, b = 100, c = 33;
        int center = 0; // 정수의 디폴트값은 "0"이다
        //System.out.println(center); => 0이 정상 출력 되는지 본 듯
        if ((a >= b && a <= c) || (a >= c && a <= b)) { // 왜 이런 식으로 문제 풀이를 했는지 공부하기
            center = a;
        } else if (b >= a && b <= c || b <= a && b >= c) {
            center = b;
        } else {
            center = c;
        }
        System.out.println("세 숫자"+a+","+b+","+c+"의 중간은 "+center+"입니다.");
    }
}
