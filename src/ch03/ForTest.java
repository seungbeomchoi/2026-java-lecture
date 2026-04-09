package ch03;

// 26.04.08.수
public class ForTest {
    static void main() {
        for (int i = 0; i < 10; i++) {
            //  1번   2번  4번실행 => 4번 실행 후 이제 1번이 아니고 2번으로 가서(1이 증가 됐으니) 쭉..가다가 i가 9까지 갔을 때 중괄호를 빠져 나간다. => 맞는 내용인지 체크.
            System.out.println("Hello world " + 1);//3번 실행
            // for(초기문;조건식; 반복 후 작업) {}
        }
        System.out.println("end");

        int sum = 0; // 1부터 100까지의 합을 구하는 코드라는데 어떤 방식으로 진행되는 건지 공부 필요.
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        // System.out.println(i); => 이 자리에선 실행이 안 된다.(중괄호를 벗어나 있어서?) => 변수의 유효 범위(스코프) 자바의 변수 유효 범위는 블록 스코프라고 한다. => 무슨 말인지 공부하기
        System.out.println(sum);

    }
}
