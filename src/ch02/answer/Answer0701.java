package ch02.answer;
//260408
public class Answer0701 {
    static void main() {
        //Answer07을 switch로 바꾼 것.
        int num = 4;
        String season = null;
        season = switch (num) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "겨울";
        };
        System.out.println(num + "월은 " + season + "입니다.");
    }
}

