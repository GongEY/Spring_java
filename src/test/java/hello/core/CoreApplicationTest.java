package hello.core;

import hello.core.order.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CoreApplicationTest {

    @Autowired
    OrderService orderService;

    @Test
    public void contextLoads(){

    }

}
