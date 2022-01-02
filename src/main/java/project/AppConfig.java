package project;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.order.OrderService;
import project.order.OrderServiceImpl;
import project.discount.FixDiscountPolicy;
import project.discount.DiscountPolicy;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }
}
