package ch03.answer;

// 26.04.08.수 - 마지막 시간.
// 2. 1부터 20까지 반복하면서 3의 배수는 출력하지 않는 프로그램을 작성하시오.
public class Answer02 {
    static void main() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }

//        아래의 주석은 왜 그렇게 코드를 작성했는지 공부하자.
//        int i = 1;
//        while (i <= 20) {
//            if (i % 3 == 0) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
    }
}