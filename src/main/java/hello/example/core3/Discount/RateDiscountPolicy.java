package hello.example.core3.Discount;

import hello.example.core3.member.Grade;
import hello.example.core3.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discountPercent /100;
        }
        else{
            return 0;
        }
    }
}
