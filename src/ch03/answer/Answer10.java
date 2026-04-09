package ch03.answer;

// 260409_Thu
// 10. 배열에 저장된 점수 중 60점 이상인 점수만 출력하고, 합격자 수를 구하는 프로그램을 작성하시오.
public class Answer10 {
    static void main() {
        int[] scores = {55, 70, 85, 40, 90, 60};
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                System.out.println(scores[i]);
                count++;
            }
        }
    }
}
