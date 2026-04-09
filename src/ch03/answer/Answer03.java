package ch03.answer;

// 3. 1부터 100까지의 수 중에서 5의 배수의 합을 구하는 프로그램을 작성하시오.
public class Answer03 {
    static void main() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
