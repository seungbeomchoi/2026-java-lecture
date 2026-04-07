package ch02.answer;
//3. Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권,
//   500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전,
//   1원짜리 동전 각 몇개로 변환되는지 출력하라.
//
//   금액을 입력하시오 >> 65370
//	 오만 원권 1매
//	 만 원권 1매
//	 천 원권 5매
//	 100원 동전 3개
//	 50원 동전 1개
//	 10원 동전 2개
public class Answer03 {
    static void main() {
        int money = 65370;
        int rest = 0;
        int money50000 = money/50000;
        rest = money%50000;
        int money10000 = rest/10000;
        rest = money%10000;
        int money5000 = rest/5000;
        rest = money%5000;
        int money1000 = rest/1000;
        rest = money%1000;
        int money500 = rest/500;
        rest = money%500;
        int money100 = rest/100;
        rest = money%100;
        int money50 = rest/50;
        rest = money%50;
        int money10 = rest/10;
        rest = money%10;

        System.out.printf("%d는 오만원권 %d, 만원권 %d, 오천원권 %d, " + // 이건 왜 이렇게 쓰고 printf는 뭐고 그 안에 괄호에 %d는 뭐고 왜 그렇게 써야 되는지 공부하기.
                "천원권 %d, 오백원 동전 %d, 백원 동전 %d, 오십원 동전 %d, 십원 동전 %d 개",
                money, money50000, money10000, money5000, money1000, money500, money100, money50,money10
        );

        // rest = money-50000*money50000;



    }
}
