package ch03;

//26.04.08.수
public class DoWhileTest {
    static void main() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10); // while과 dowhile의 차이는 실행 부분의 차이? => 중괄호를 do {} 에 올린 것. / 조건을 만족하지 않아도 dowhile는 일단 한 번은 실행한다?(팩트 체크하기)

        char ch = 'a';
        do {
            System.out.print(ch);
            ch = (char) (ch + 1);
        } while (ch <= 'z');
    }
}
    /*package ch03; 강사님 dowhile문

public class DoWhileTest {
    static void main() {
        int i = 100;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<10);
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
*/



