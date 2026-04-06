public class CircleArea {
    static double circleArea(double radius) { // 이 함수를 실행을 하면 double을 반드시 return을 해야 한다.
        // double을 리턴하기 싫으면 void로 주면 된다. 즉, 리턴 값이 없을 땐 void
        final double PI = 3.14;
        // double radius = 10; // 반지름 값 할당
        double result = PI * radius * radius;
        return result;

    }

    static void main() {
        // circleArea(); // 결과 값은 314.0
        System.out.println(circleArea(10));
        System.out.println(circleArea(4));

    }
}
