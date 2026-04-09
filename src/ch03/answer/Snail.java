package ch03.answer;

// 260409_Thu

//  1  2  3  4  5
//  16 17 18 19 6
//  15 24 25 20 7
//  14 23 22 21 8
//  13 12 11 10 9

public class Snail {
    static void main() {
        int size = 5;
        int[][] array = new int[size][size]; // 5X5 사이즈가 하나 만들어 지는 거라는데 왜 그렇게 되는 것인지 공부 필요.
        int num = 1;
        int top = 0;
        int bottom = size - 1; // 배열은 0부터 시작이다 => 0부터 시작하니까 4개라고 하는데 그게 무슨 말?
        int left = 0;
        int right = size - 1; //
        while (num <= size * size) {
            // left에서 right로 이동하는 첫 번째 줄을 써 볼 것이다. (top fix)
            for (int i = left; i <= right; i++) { // 여긴 왜 이렇게 나오는지 그리고 while문 안에 for문은 어떻게 들어갈 수 있는지
                array[top][i] = num++; // 여긴 왜 이렇게 나오는지 => 여기까지 하면 {1,2,3,4,5} 첫 줄 채워진 거라는데 뭔지 이해할 수가 없음.
            }
            top++;
            // top -> bottom (right fix)
            for (int i = top; i <= bottom; i++) {
                array[i][right] = num++;
            }
            right--;
            // right에서 left로 이동 (bottom fix)
            for (int i = right; i >= left; i--) {
                array[bottom][i] = num++;
            }
            bottom--;
            // bottom에서 top로 이동 (left fix)
            for (int i = bottom; i >= top; i--) {
                array[i][left] = num++;
            }
            left--; // 이렇게 하면 뺑뺑이 도는 것?


        }
    }
}
