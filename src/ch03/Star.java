package ch03;

public class Star {
    static void main() {
        // 순서대로 * 나오는 방법
        for (int j = 1; j <= 5; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // *을 거꾸로. 즉 5,4,3,2,1 이렇게 찍으려면?
        for (int j = 5; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
