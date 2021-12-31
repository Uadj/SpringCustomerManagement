package project.discount;
import project.Member;

public interface DiscountPolicy {
    // return 할인금액
    int discount(Member member, int price);
    
}
