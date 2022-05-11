package works.cylon.echo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {
	
	@GetMapping(path="mirror")
	@ResponseBody
	public String mirror(String input) {
		return input;
	}
}
