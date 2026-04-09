package ch03;

// 260409_THU
public class Review {
    static void main() {
        // 반복을 쉽게 쓰기
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world" + i);
        }
        System.out.println("for end");
        //System.out.println(i); //block scope 대부분의 언어는 block을 유효범위로 한다.
        int j = 0;
        while (j < 10) {
            System.out.println("hi world" + j);
            j++;
        }
        //배열  순서 메기기
        int num = 10;  //10,20,30,40,17,34
        int[] nums = new int[3];   //reference (주소값을 공유)
        nums[0] = 10;
        nums[1] = 45;
        nums[2] = 27;
        System.out.println(nums[1]);
        int[] copyNums = nums;  //주소 공유
        copyNums[1] = 100;
        System.out.println(nums[1] + "===" + copyNums[1]); //얕은 복사 shallow copy
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);
        }
    }
}
