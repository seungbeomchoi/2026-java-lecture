package ch03;

// 26.04.08.수
public class WhileTest {
    static void main() {
        //while (조건) for문과 다르게 ()안에 초기화?가 필요 없음=? 초기화가 무슨 말?
        int i = 0;
        int sum = 0;
        while (i <= 10) {
            sum += i;// 1
            i++;
        }
        System.out.println(sum);
        //println()은 줄을 바꾸는 것? => 줄을 안 바꾸고 싶으면 그냥 print()까지만 쓰면 된다? => 맞는 내용인지, 어떤 때 따로 쓰는지 체크. 그러면 printf는 왜 쓰는지, 어디에 쓰는지도 같이 체크
        //조건문 안에 반복문 쓸 수 있고 반복문 안에 조건문 쓸 수 있다.


        /* 강사님이 while문 좀 더 심화해서 보여준 것. 왜 저렇게 가능한 건지 자세하게 공부 필요함.
        int i=1;
        int sum=0;
        while(i<=10) {
            if(i<10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
            sum+=i;
            i++;
        }
        System.out.print(sum);
        // 1+2+3+4+5+6+7+8+9+10=55
         */
    }
}
