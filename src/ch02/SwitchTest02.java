package ch02;

import java.time.LocalDate;

public class SwitchTest02 { // 26.04.07.화
    static void main() {

        // 같은 방식을 너무 많이 쓰는 건 비효율적이라 프로그래머들이 추가로 기능을 만들었다고 함.
        // switch도 다르게 쓰는 방법이 있다고 함.
        // 이렇게 줄일 수도 있음.

        /*
        int month = 4;
        switch (month) {
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8, 9:
                System.out.println("여름");
                break;
            default:
                System.out.println("가을");
        }
        */

        int month = 4;
        String season = null; // 이건 마지막에 추가된 것.

        switch (month) { // break; 삭제 버전. case : 에서 ":" 대신 "->"을 쓰고 break;는 지운다.
            // 강사님 : 이렇게 쓰면 가독성 높게 작성한 코드이다.
            case 12, 1, 2 ->
                //System.out.println("겨울"); // case 안에 코드가 두 줄이 되면 중괄호를 표시해야 한다. 여긴 한 줄이라서 중괄호가 생략된 것.
                    season = "겨울";
            case 3, 4, 5 ->
                //System.out.println("봄");
                    season = "봄";
            case 6, 7, 8, 9 ->
                //System.out.println("여름");
                    season = "여름";
            default ->
                //System.out.println("가을");
                    season = "가을";
        }
        System.out.println(season);

        // 스위치도 식으로 쓸 수 있다. 순서대로 알려주시는 거 같은데 어떤 기능이 있는지. 계속 뭐가 나와서 따라가기 벅차다.

        // 이렇게 줄여서도 코드를 쓸 수 있다.
        int month1 = 4;
        String season1 = null;
        season1 = switch (month1) {
            case 12, 1, 2 -> {
                yield "겨울"; // switch을 "식"으로 쓸 수 있는데 그럼 꼭 yield를 사용해야 한다.
            }
            case 3, 4, 5 -> {
                yield "봄";
            }
            case 6, 7, 8, 9 -> {
                yield "여름";
            }
            default -> {
                yield "가을";
            }
        }; // 여긴 왜 다른 switch와 다르게 ";" 세미콜론으로 끝났는지 팩트 체크하고 공부할 것.
        System.out.println(season1);


        // case가 한 줄 일 때는 아래처럼 완전 생략해서 사용할 수도 있다.
        int month2 = 4;
        String season2 = null;
        season2 = switch (month2) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8, 9 -> "여름";
            default -> "가을";
        };
        System.out.println(season2);

                            // now는 현재 날짜 나타내는 것 / 특정 날짜를 알고 싶으면 now대신 .of(2027, 4, 7); 이런 식으로 쓰면 된다. 이렇게 썼을 때 year, month, dayOfMonth가 회색 작은 글씨로 나오는데 그건 힌트이다. => 맞는 말인지 체크
        LocalDate today = LocalDate.now();  // 연, 월, 일? 이건 어떻게 사용하고 어떤 변수명이 어떤 자리에 들어가는지 상세하게 알려줘 주석 하나하나 달아서
        System.out.println(today); // 이렇게 하면 오늘 날짜가 나옴. 2026-04-07 이렇게 나옴
        System.out.println(today.getDayOfWeek().getValue()); // 요일을 나타나게 하는 방법 TUESDAY 이렇게 나옴(영어로만 나오고 월~일로는 안 나옴)
        //.getValue() 하면 TUESDAY로 안 나오고 숫자 2로 나온다. 즉 숫자로 나오는 것. 이걸 활용해서 2일 때 화요일로 바꾸는 것이다.? => 맞는지 팩트 체크 및 설명




        // 날짜를 무슨 요일인지 알고싶다고 했을 때.
        int day = today.getDayOfWeek().getValue(); // 원래 숫자 2만 써놨었는데 today.getDayOfWeek().getValue() 이걸 붙여 넣었음. => 이게 어떤 의미가 되는지 설명
        // int day = 2; 였을 때와 어떤 차이가 있는지 상세하게 설명 및 주석 필요.

        // 여기까지만 하면 switch 문 <=> 값으로 귀결되면 "식" / 그렇지 않으면 "문"
        switch (day) { // 지금은 default가 없어도 된다. 지금은 "문"이기 때문에.
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("해당하는 요일이 없습니다.");
        }


        // enhanced switch => 기능이 향상된 스위치문? 이라고 부른다.
        switch (day) { // 지금은 default가 없어도 된다. 지금은 "문"이기 때문에.
            case 1 -> System.out.println("월요일");
            case 2 -> System.out.println("화요일");
            case 3 -> System.out.println("수요일");
            case 4 -> System.out.println("목요일");
            case 5 -> System.out.println("금요일");
            case 6 -> System.out.println("토요일");
            case 7 -> System.out.println("일요일");
            default -> System.out.println("해당하는 요일이 없습니다.");
        }


        String yoil = switch (day) {
            case 1 -> "월요일"; // 한 줄 일 때는 yield도 지우고 중괄호도 지우고 이렇게만 쓸 수 있다.
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "해당하는 요일이 없습니다.";
        }; // 여긴 값이라서 세미콜론으로 끝내야 한다. => 왜? 공부하기
        System.out.println(yoil);

    }

}

