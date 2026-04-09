package ch03;

// 26.04.08.수
public class ContinueTest {
    static void main() {
        int sum = 0;
        // continue는 건너뛰기(반복문 안에 실행문을 건너 뛴다.) => 특정 조건을 건너 뛰는 필터링 역할을 하는 게 continue
        // break는 반복문을 빠져 나간다.
        // continue, break 둘 다 많이 사용한다.
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) { // 여기서 i%2는 무슨 말인지
                continue; // 조건을 만족했을 때 중괄호 안에 있는 내용을 건너 뛰어라? 라는 뜻?
                // break는 반복문을 빠져 나가라는 뜻?
            }
            System.out.print(i + " / "); // 여긴 왜 sum이 들어가는지
        }
    }
}
