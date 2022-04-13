package board.springjpaboard.service;

import board.springjpaboard.domain.Address;
import board.springjpaboard.domain.Member;
import board.springjpaboard.repository.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setMember("sunset", 22, new Address("인천", "원당대로","226"));

        // when
        Long savedId = memberService.join(member);

        // then
        Assertions.assertEquals(member, memberRepository.findOne(savedId));
    }

    @Test
    void 중복회원검증() {
        // given

        // when

        // then
    }

    @Test
    void 회원수정() {
        // given

        // when

        // then
    }

    @Test
    void 회원등급() {
        // given

        // when

        // then
    }

}