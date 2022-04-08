package demo.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author lyp3314@gmail.com
 * @Date 2022/4/8
 */

@Configuration
@ComponentScan(value = "demo.hello")
public class HelloSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				HelloSpring.class);
		HelloService helloService = (HelloService) applicationContext.getBean("helloService");
		helloService.hello("Spring");
	}

}
