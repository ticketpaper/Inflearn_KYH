package hello.example.core3.member;

public interface MemberRepository {

    void save(Member member);

    Member findByID(Long memberId);

}
