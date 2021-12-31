//package project.discount;

import project.Member;
import project.Grade;
import project.discount.*;
import org.junit.Test;
import org.assertj.core.api.Assertions;
public class RateDiscountPolicyTest {
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();
    
    
    @Test
    void vip_o(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        int discount = rateDiscountPolicy.discount(member,1000);
        //then
        Assertions.assertThat(discount).isEqualTo(900);
    }
}
