package hello.example.core3.Discount;

import hello.example.core3.member.Grade;
import hello.example.core3.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFIxAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFIxAmount;
        }
        else {
            return 0;
        }
    }
}
