package hello.example.core3;

import hello.example.core3.Discount.DiscountPolicy;
import hello.example.core3.Discount.FixDiscountPolicy;
import hello.example.core3.Discount.RateDiscountPolicy;
import hello.example.core3.Order.OrderService;
import hello.example.core3.Order.OrderServiceImpl;
import hello.example.core3.member.MemberService;
import hello.example.core3.member.MemberServiceImpl;
import hello.example.core3.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        System.out.println("AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(),discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
