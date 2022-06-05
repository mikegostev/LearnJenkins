package works.cylon.censor;

import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CensorController {

	private Set<String> stopWords = Set.of(
			"fuck",
			"Ukraine",
			"loan"
			);
	
	@GetMapping(path = "censor")
	@ResponseBody
	public String censor(String input) {
		return stopWords.contains(input) ? "<censored>" : input;
	}
}
