package hello.example.core3.Member;

import hello.example.core3.AppConfig;
import hello.example.core3.member.Grade;
import hello.example.core3.member.Member;
import hello.example.core3.member.MemberService;
import hello.example.core3.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;
    @BeforeEach
    public void BeforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void Join(){
        //given
        Member member = new Member(1L, "MemberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findeMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findeMember);

    }
}
