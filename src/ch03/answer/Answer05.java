package ch03.answer;

// 260409_Thu
// 5. 1부터 30까지 반복하면서 2의 배수이면서 3의 배수인 수만 출력하는 프로그램을 작성하시오.
public class Answer05 {
    static void main() {
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0 && i % 3 == 0) { // 이게 무슨 뜻인지 전혀 모르겠음. 하나씩 뜯어서 공부하자.
                System.out.println(i);
            }
        }
    }
}
