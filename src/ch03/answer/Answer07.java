package ch03.answer;

// 260409_Thu
// 7. 구구단 2단부터 9단까지 출력하되, 각 결과가 짝수인 경우만 출력하는 프로그램을 작성하시오.
public class Answer07 {
    static void main() {
        for (int dan = 2; dan < 10; dan++) {
            for (int i = 1; i < 10; i++) {
                if (dan % 2 == 0) {
                    System.out.println(dan + "x" + i + "=" + dan * 1);
                }
            }
        }
    }
}
