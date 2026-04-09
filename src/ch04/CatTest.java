package ch04;

public class CatTest {
    static void main() {
//        String cat01Name = "미묘";
//        String cat01Category = "코숏";
//        int cat01Age = 3;

        Cat cat01 = new Cat(); // object = instance(인스턴스) 라고 부른다.
        cat01.name = "러블리";
        //cat01["age"]=3; // 이 방식은 거의 안 쓰고 .(dot)쓰면 된다
        cat01.age = 3;

        Cat cat02 = new Cat();
        cat02.name = "야옹이";
        cat02.age = 4;

        Cat cat03 = cat01;

        Cat[] cats = new Cat[2];
        cats[0] = cat01;
        cats[1] = cat02;
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].name); // 배열에 접근하는 것 => 어떻게 쓰는 건지, 왜 쓰는 건지, 어떤 방식으로 쓰는 건지 공부 필요.
            System.out.println(cats[i].age);
            // 배열에는 객체를 넣을 수 있다. => 무슨 말인지 체크
        }
    }
}
