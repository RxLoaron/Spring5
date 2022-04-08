package demo.hello;

import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Date 2022/4/8
 */

@Service
public class HelloService {

	public void hello(String name) {
		System.out.println("Hello " + name + " !");
	}
}
