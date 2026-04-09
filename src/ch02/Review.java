package ch02;
//26.04.08.수
public class Review {
    static void main() {
        boolean isTrue = true;
        boolean isBig = 5 > 3;
        boolean isLogical = 5 > 3 && 10 < 5;
        String userID = "jjang051";
        String userPW = "1234";
        if (isLogical) {
            System.out.println("참일 때 출력");
        } else {
            System.out.println("else일 때 출력");
        }
        if (userID == "jjang051" && userPW == "1234") {
            System.out.println("로그인 성공");
        }
        int grade = 1;
        switch (grade) {
            // 정수 문자열 문자(char)만 된다(같다, 다르다 올 수 없고 실수도 올 수 없다.) => 무슨 말인지 체크
            case 1:
                System.out.println("1등급 소고기 한근에 30000");
                break;
            case 2:
                System.out.println("2등급 소고기 한근에 20000");
                break;
            case 3:
                System.out.println("3등급 소고기 한근에 10000");
                break;
            default:
                System.out.println("식용 불가");
        }

        String order = "와퍼";
        int price = 0;
////        switch (order) {
////            case "와퍼":
////                price = 7000;
////                break;
////            case "빅맥":
////            case "칠리버거":// 이렇게 적으면 빅맥이랑 칠리버거 모두 6000원
////                price = 6000;
////                break;
////            case "리아버거":
////                price = 5000;
////                break;
////            default:
////                price = 4000;
////        }
        price = switch (order) {
            case "와퍼" -> 7000;
            case "빅맥", "칠리버거" -> 6000;
            case "리아버거"-> 5000;
            default -> 4000;
        }; // 값으로 귀결되기 때문에 여기에 세미콜론 붙여야 함.
        System.out.println("주문하신 "+order+"는 가격 : "+price);

        String command ="save";
        switch (command) {
            case "save" -> System.out.println("저장");
            case "delete" -> System.out.println("삭제");
            case "copy" -> System.out.println("복사");
            default -> System.out.println("잘못된 명령");
        }

    }
}
