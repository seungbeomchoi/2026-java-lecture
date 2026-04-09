package ch04;

// 260409_Thu
// Student.java 파일과 같이 사용?
// 굉장히 중요한 내용이라고 함. => 공부 필수인 듯
// class는 "~류"라고 하는 것임. ex) 파충류처럼 비슷한 걸 모아놓은 것
// class
public class ClassTest01 {
    static void main() {
        Student student01 = new Student(); // new가 들어가서 참조 타입? 왜?
        student01.name="전세진";
        student01.age=25;
        student01.weight=65.5;
        student01.iq=120;
        Student student02 = new Student();
        student02.name="권석진";
        student02.age=27;
        student02.weight=75.5;
        student02.iq=125;


    }
}
