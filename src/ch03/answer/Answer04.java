package ch03.answer;

// 260409_Thu
//4. 1부터 10까지 반복하면서 각 숫자가 홀수인지 짝수인지 출력하는 프로그램을 작성하시오
public class Answer04 {
    static void main() {
        // 4번 완성
        for (int i = 0; i <= 10; i++) {
            String str = i % 2 == 0 ? "짝수" : "홀수"; // 이게 어떻게 쓰는 건지, 무슨 뜻인지 자세하게 알아 보기
            System.out.println(i + ":" + str);

        }
    }
}
