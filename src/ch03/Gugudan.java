package ch03;

// 26.04.08.수

/* 이중 for문을 사용해서 아래처럼 만들어라.

 *
 **
 ***
 ****
 *****

 */

public class Gugudan {
    static void main() {
        //구구단 출력(조건문 안에 조건문, 반복문 안에 조건문, 조건문 안에 반복문은 쓸 수 있는데 반복문 안에 반복문도 사용할 수 있을 것인지 확인하는 듯. => 맞는 말인지 전체 체크
        // int dan = 5; 이렇게 했을 때는 5단만 나왔었음. for안에 for 즉, 이중for문 쓰기 전에
        for (int dan = 2; dan < 10; dan++) { // => 이 for문이 아래 for문 안에 있을 때는 2x1=2, 3x1=3, 4x1=4 이렇게 나왔음. 근데 지금처럼 했을 땐 2x1=2, 2x2=4, 2x3=6 이런식으로 순서대로 나옴 => 왜? 공부하기
            for (int i = 1; i < 10; i++) {
                System.out.print(dan + "x" + i + "=" + dan * i); // dan은 고정이니까
                //System.out.printf("%d x %d = %2d\t", dan, i, dan * i); 이렇게도 바꿀 수 있음 => 어떻게 이렇게 바꾸는 거며 이렇게 바꿔서 출력하는 건 뭐라고 이름을 부르나?
            }// i가 9가 되면 여기를 빠져 나가는데
            System.out.println(); // 위의 println을 print로 수정하고 여기를 만들면 2단끼리 좌로 쭉 나오고 그 다음 줄에 3단끼리 쭉 나오고 그렇게 변함 => 어떤 방식으로 그렇게 되는지?
        }// 여기는 못 빠져 나감? => 맞는 말인지


    }
}

/*
자바는 무조건 줄 바꿈을 해야 한다. 하지만 여기선 눈속임을 통해서 가로로 쭉 만든다. 그걸 이중폼이라고 한다 => 행렬처럼? (이중폼이 무슨 말인지 어떤 때 쓰는지 확인) 보통 삼중폼 이상은 잘 사용하지 않음.
ex. DB할 때 이중폼(행렬) 많이 쓰고, 삼중폼은 거의 안 쓰는데 예를 들어 매트리스? 같은 걸 만들 때 사용한다고 함.(여기서 매트리스란 무엇인지?)

아래는 강사님 코드
package ch03;

public class Gugudan {
    static void main() {
        //int dan = 5;
        for (int i = 1; i < 10; i++) {
            for (int dan = 2; dan < 10; dan++) {
                System.out.printf("%d x %d = %2d\t", dan, i, dan * i);
            }
            System.out.println();
        }
    }
}


 */