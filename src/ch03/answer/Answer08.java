package ch03.answer;

// 260409_Thu
// 8. 1부터 100까지 반복하면서 7의 배수가 처음 나오는 순간 반복문을 종료하는 프로그램을 작성하시오.
public class Answer08 {
    static void main() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
