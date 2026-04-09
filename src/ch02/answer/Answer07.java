package ch02.answer;

// 260408
//7. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
//   그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
//   if-else 문과 switch 둘 다 이용해볼 것.
//
//  달을 입력하세요(1~12) >> 9
//
//  가을
public class Answer07 {
    static void main() {
        int num = 4;
        String season = null;
        if (num==3 || num==4 || num==5) {
            season="봄";
        } else if(num==6||num==7||num==8) {
            season="여름";
        }else if(num==9||num==10||num==11) {
            season="가을";
        } else {
            season="겨울";
        }
        System.out.println(num+"월은 "+season+"입니다.");
    }
}
