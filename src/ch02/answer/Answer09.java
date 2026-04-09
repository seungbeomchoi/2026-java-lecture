package ch02.answer;
//26.04.08.수
//9. 몸무게(kg)와 키(cm)를 입력받아서 비만도(bmi)를 측정하는 프로그램을 만드시오
//
// 	 계산식	신체질량지수(BMI) = 체중(kg) / 신장(m)*신장(m)
//	 판정기준	저체중	20 미만
//	 정상	20 - 24
//	 과체중	25 - 29
//	 비만	30 이상
//   | 구분 | 내용 | 기준 |
//| --- | --- | --- |
//| 계산식 | 신체질량지수(BMI) | 체중(kg) / [신장(m)]² |
//| 판정기준 | 저체중 | 20 미만 |
//| 판정기준 | 정상 | 20 ~ 24 |
//| 판정기준 | 과체중 | 25 ~ 29 |
//| 판정기준 | 비만 | 30 이상 |
public class Answer09 {
    static void main() {

        double weight = 93;
        double height = 184;
        double bmi = 0;
        double heightMeter =  height/100;
        bmi =  weight / (heightMeter*heightMeter);
        String result = null;
        if(bmi<20) {
            result="저체중";
        } else if(bmi>=20 && bmi<25) {
            result="정상";
        } else if(bmi>=25 && bmi<30) {
            result="과체중";
        } else {
            result="비만";
        }
        System.out.printf("당신의 몸무게는 %.2f 키는 %.2f이고 %s",weight, height,result);

    }
}
