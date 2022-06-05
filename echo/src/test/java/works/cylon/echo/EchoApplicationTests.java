package works.cylon.echo;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EchoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Disabled("Not needed")
	@Test
	void mustFail() {
		assertEquals(true, false, "Must be true.");
	}

}
