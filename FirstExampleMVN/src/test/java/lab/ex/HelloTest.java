package lab.ex;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-helloworld.xml" })//컨테이너에게 xml 읽어서 bean 객체 생성하는 명령

public class HelloTest {
	@Resource(name = "helloworld")
	HelloWorldService hello;

	@Test
	public void testHello() throws Exception {
		String result = hello.sayHello();
		assertEquals(result, "Hello lab101!!!");
	}

}
