package hello.example.core3;

import hello.example.core3.Order.Order;
import hello.example.core3.Order.OrderService;
import hello.example.core3.Order.OrderServiceImpl;
import hello.example.core3.member.Grade;
import hello.example.core3.member.Member;
import hello.example.core3.member.MemberService;
import hello.example.core3.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        OrderService orderService = appConfig.orderService();
//        MemberService memberService = appConfig.memberService();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(memberA);

        Order order = orderService.createORder(memberId, "itemA", 23000);
        System.out.println("order = "+ order);
    }
}
