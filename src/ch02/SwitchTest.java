package ch02;
// 스위치문 단점. => "식"같은 것들이 못 들어간다. 즉 크다, 작다 같은 것들은 못 들어 감.
public class SwitchTest { // 26.04.07.화
    static void main() {
        //switch는 조건을 쓰는 다른 방법

         /* 이게 switch문의 기본 형식? => 맞는지 자세하게 체크
        switch (expression) {
            case 값01 : "이게 맞으면" 아래 실행문을 실행
                실행문;
                break;
            case 값02 :
                실행문;
                break;
        }
        */

        String order = "말차라떼";
        switch (order) {
            case "아이스아메리카노":// 문자 또는 문자열, 정수만 들어갈 수 있다.(팩트 체크 및 공부하기)
                System.out.println("2000원 입니다.");
                break;

            case "카라멜마끼아또":
                System.out.println("4500원 입니다.");
                break;
            case "카페모카":
                System.out.println("5000원 입니다.");
                break;

            default: // 디폴트는 브레이크가 없다.
                System.out.println("해당 메뉴는 없습니다.");
        }

        // 강사님 답 => 왜 이렇게 코드를 짰는지 공부하기.(코드 한 줄 한 줄에 주석 하나씩 다 달아서)
        int score = 75;
        switch (score / 10) {
            case 10:
                /* System.out.println("A");
                break;  아래 case 9:에 내용이 있으니 그냥 안 써도 된다*/
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        // 강사님 문제
        // 변수는 month = 3
        // 12, 1, 2 겨울 / 3, 4, 5 봄 / 6, 7, 8, 9 여름 / 10, 11 가을
        int month = 3;
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("여름");
                break;
            /*case 10: 나는 여기까지 이렇게 작성했는데
            case 11:
                System.out.println("가을");
                break; */

            default: // 어차피 위에 이후엔 나머지라서 그냥 디폴트 쓰면 된다.
                System.out.println("가을");
                break; // 강사님은 가을인 10, 11을 그냥 디폴트로 줬다. 기억할 것.
        }
        // 위처럼 같은 방식을 너무 많이 쓰는 건 비효율적이라 프로그래머들이 추가로 기능을 만들었다고 함.
        // switch도 다르게 쓰는 방법이 있다고 함. => SwitchTest02.class 파일에 가면 있음.



        /*
        // 아래를 switch처럼 만들어라.
        int num = 3;
        if (num % 2 == 1) {


            System.out.println("홀수입니다.");

        } else {
            System.out.println("짝수입니다.");
        }

        int score = 82;
        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {

            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");

        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        */


    }
}



