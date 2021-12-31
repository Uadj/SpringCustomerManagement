package project;
import project.order.OrderService;
import project.order.OrderServiceImpl;
import project.discount.FixDiscountPolicy;
import project.discount.DiscountPolicy;
public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
