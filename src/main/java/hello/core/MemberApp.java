package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        /* 의존관계 주입을 위한 객체 생성 */
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        /* 회원가입 */
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        /* 회원조회 */
        Member findMember = memberService.findMember(1L);

        /* 결과 출력 */
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
