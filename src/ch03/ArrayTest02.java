package ch03;

//260409_Thu
public class ArrayTest02 {
    static void main() {
        String[] names = new String[3];
        names[0] = "전지현";
        names[1] = "송혜교";
        names[2] = "김태희";

        String[] actors = {"장동건", "이병헌", "송강호"}; // 배열 선언과 동시에 할당
        int[] nums = {10, 30, 27, 98, 102, 121, 21212, 2121, 121, 212, 2, 12, 1, 214, 3, 424324, 32, 4343554, 3543}; // 이제 반복문으로 돌릴 수 있다 => 왜?
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) { // nums.length를 하면 자기가 알아서 숫자를 센다? => 왜?
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("제일 큰 숫자는 " + max);
        // enhanced for => for each문? 오늘 9일 차에 처음 배우는 내용.(3월30일에 시작했으면 9일 차 맞나?)(맞는 말인지 체크하기)
        for (String actor : actors) {
            System.out.println(actor);
        }
        enum Week {월, 화, 수, 목, 금, 토, 일}
        ;
        // enum 이라고 함. / 열거형(즉, 나열하는 것) => 나중에 배운다는데 어떤 건지 공부할 것.
        // Week.values = [월, 화, 수, 목, 금, 토, 일]
        // System.out.println(Week.values()[0]); 이렇게 하면 "월요일"이 나온다 => 왜? 어떻게?
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        int[][] intArray = new int[4][2]; // 여기는 왜 [4] [2]인가? / 2차원 배열? 행과 열을 표시할 수 있음. => 왜? 어떻게?
        intArray[0][0] = 80;
        intArray[0][1] = 90;
        intArray[1][0] = 78;
        intArray[1][1] = 92;
        intArray[2][0] = 87;
        intArray[2][1] = 97;
        intArray[3][0] = 81;
        intArray[3][1] = 99;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println((i + 1) + "학년 " + (j + 1) + "학기 점수 : " + intArray[i][j]); // => 왜 이렇게 해서 출력을 했는지? j는 갑자기 또 왜 나왔는지 확인
            }
        }
        double[][] doubleArray = {{3.7, 4.2}, {3.9, 4.1}, {4.25, 4.17}, {4.1, 4.34}};
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.println((i + 1) + "학년 " + (j + 1) + "학기 점수 : " + doubleArray[i][j]);
            }
        }
        for (double[] row : doubleArray) {
            for (double value : row) {
                System.out.println(value + "/");
            }
        }
    }
}
