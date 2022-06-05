package works.cylon.censor;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CensorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Disabled("Not needed")
	@Test
	void mustFail() {
		assertEquals(true, false, "Must be true.");
	}

}
