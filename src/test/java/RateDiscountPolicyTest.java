//package project.discount;

import project.Member;
import project.Grade;
import project.discount.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class RateDiscountPolicyTest {
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();
    
    
    @Test
    @DisplayName("10%")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        int discount = rateDiscountPolicy.discount(member,10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }
    
    @Test
    @DisplayName("10%x")
    void vip_x(){
        Member member = new Member(1L, "memberB", Grade.BASIC);
        //when
        int discount = rateDiscountPolicy.discount(member,10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }
}
