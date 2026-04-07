package ch01;

public class Hi { // 여기서 Hi는 식별자? 식별자가 무슨 뜻인지 주의사항은 무엇인지 확인하기
    public static int sum(int x, int y) {// void가 아니고 int(즉, 타입)로 줬으면 return값을 줘야 에러가 없어진다? // 여기에 void가 있으면 return이 없어도 된다. (텅 빈)
                        // 변수 x 앞에는 무조건 타입 int가 필요하다. => 변수 앞에는 무조건 타입 필요!

        // 강타입 언어 / 약타입 언어
        // int num = 10; // 여기선 int가 type이다.
        // return num; // 리턴으로 10을 돌려주겠다는 것
        return x+y; // 메서드가 int값을 가지면 무조건 return을 해야함. 왜 리턴을 해?=> 공부하자.
    }

    static void main() {
        //System.out.println(num); // 이렇게 하면 숫자 10이 CLI에 출력된다. 근데 위에 이미 코드가 닫혔는데 왜 여기서 다시 열었더니 실행되는지 잘 모르겠음. 공부할 것.

        System.out.println(sum(12,32));
        int num = 10; // 식별자 앞에는 공백, 특수문자 사용할 수 없음. 특수문자는 딱 2개만 인정해 준다. "_"언더 스코어랑 $만 인식을 한다. => 나머지는 변수 이름 앞에 사용하면 안 된다.
        // int의 뜻이 정수? 그럼 나머지는 어떤 것들이 있는지 상세하게 체크해볼 것. / 위의 int num = 10;은 정수 리터럴.
        String name = "장성호"; // 변수에 담을 수 있는 이런 고유한 값들을 "리터럴"이라고 한다. 즉 여긴 문자열 리터럴.
        char c = 'a'; // 여기선 왜 작은 따옴표를 쓰는지(문자열이 아니라서 그렇다는데) 확실하게 체크할 것 => 여기는 문자 리터럴.
        System.out.println(num*2);
    }

}
