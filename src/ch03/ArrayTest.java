package ch03;

// 26.04.08.수
public class ArrayTest {
    static void main() {
        // array 배열, 배열은 번호 메기기
        // int num=10;
        //10, 20, 30, 40, 50
        // 이젠 배열은 예전만큼 안 쓴다. 예전에 컴퓨터 메모리가 작을 때 사용 많이 했었음.
        // 단점. 한 번 정해 놓으면 확장이 어렵다.
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 50;
        nums[3] = 45;
        nums[4] = 27;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // 배열은 레퍼런스(참조) 타입? => 무슨 말인지 팩트 체크
        String[] names = {"장동건", "전지현", "송혜교"}; // 생성과 동시에 값을 넣고 싶다면 중괄호를 사용하면 된다.
        // 참조 타입이 기본 타입과 어떻게 다르게 행동하는지 공부할 것.
        String[] actors = names; // 전문 영어로 얕은 카피라고 함 => 영어로 sharrow copy => 무슨 뜻인지 모르니까 공부할 것.
        actors[0] = "하지원";
        names[1] = "김숙";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "===" + actors[i]);
        }
        int a = 10;
        int b = a;
        a = 30; // 값을 복사
        System.out.println(a + "===" + b);
    }
}
/*
기존 코드
package ch03;

// 26.04.08.수
public class ArrayTest {
    static void main() {
        // array 배열, 배열은 번호 메기기
        // int num=10;
        //10, 20, 30, 40, 50
        // 이젠 배열은 예전만큼 안 쓴다. 예전에 컴퓨터 메모리가 작을 때 사용 많이 했었음.
        // 단점. 한 번 정해 놓으면 확장이 어렵다.
        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 50;
        nums[3] = 45;
        nums[4] = 27;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        // 배열은 레퍼런스(참조) 타입? => 무슨 말인지 팩트 체크
        String[] names = {"장동건", "전지현", "송혜교"}; // 생성과 동시에 값을 넣고 싶다면 중괄호를 사용하면 된다.
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        String [] actors = names;

        // 자바에 있는 기본 8개의 타입은 값을 복사한다 아래처럼.
        int a = 10;
        int b = a;
        a = 30; // 값을 복사
        System.out.println(a + "===" + b);

    }
}

 */