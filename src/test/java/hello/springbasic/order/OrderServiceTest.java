package hello.springbasic.order;

import hello.springbasic.member.Grade;
import hello.springbasic.member.Member;
import hello.springbasic.member.MemberService;
import hello.springbasic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        memberService.join(member);
        Order order = orderService.createOrder(1L, "itemA", 10000);
        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
