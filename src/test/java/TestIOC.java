import cn.kgc.spring.bean.DaGuiZi;
import cn.kgc.spring.bean.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01(){
        /*HelloSpring helloSpring = (HelloSpring) ioc.getBean("helloSpring");
        helloSpring.pr();*/

        DaGuiZi daGuiZi = ioc.getBean(DaGuiZi.class);
        daGuiZi.say();
    }
}
