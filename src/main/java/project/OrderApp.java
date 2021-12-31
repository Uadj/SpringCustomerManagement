package project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.order.Order;
import project.order.OrderService;
import project.order.OrderServiceImpl;
import project.AppConfig;
@SpringBootApplication
public class OrderApp {
    public static void main(String[] args){
        AppConfig appConfig = new AppConfig();
        MemberService memberService =  appConfig.memberService();
        OrderService orderService =  appConfig.orderService();
        
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
