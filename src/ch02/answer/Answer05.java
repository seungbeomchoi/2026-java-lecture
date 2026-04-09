package ch02.answer;
//260408
//5. Scanner 를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고
//   이 3개의 수로 삼각형을 만들 수 있는 지 판별하라.
//   삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
//   정수 3개 입력 >> 4 3 5
//
//   삼각형이 됩니다.
public class Answer05 {
    static void main() {
        int a = 4, b = 3, c = 5;
        /*
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("삼각형이 될 수 있습니다.");
        } else {
            System.out.println("삼각형이 될 수 없습니다.");
        }
        */
        //or조건으로 바꿨을 때
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("삼각형이 될 수 없습니다.");
        } else {
            System.out.println("삼각형이 될 수 있습니다.");
        }
        if (a + b > c || a + c > b || b + c < a) {
            System.out.println("삼각형이 될 수 있습니다.");
        } else {
            System.out.println("삼각형이 될 수 없습니다.");
        }

    }
}
