package ch03.answer;

// 260409_Thu
// 9. 아래와 같이 별을 출력하되, 행 번호가 홀수일 때만 출력하는 프로그램을 작성하시오.
public class Answer09 {
    static void main() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) continue;
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
