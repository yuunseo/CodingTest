package Programmers.Java;

public class level0_26 {
    public int solution(int price) {
        if(price >= 500000) return (int)(price*0.8); //50만원 이상, 20%할인이므로 총 가격의 80%만 지불
        else if(price>= 300000) return (int)(price*0.9); //30만원 이상, 10%할인이므로 총 가격의 90%만 지불
        else if(price >=100000) return (int)(price*0.95); //10만원 이상, 5%할인이므로 총 가격의 95%만 지불
        else return price; //10만원 미만, 할인이 적용되지 않는다.
    }
}
