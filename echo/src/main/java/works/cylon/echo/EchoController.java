package works.cylon.echo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Controller
public class EchoController {
	private UUID uuid = UUID.randomUUID();

	private RestTemplate rest = new RestTemplate();
	
	@GetMapping(path = "mirror")
	@ResponseBody
	public String mirror(HttpServletRequest reqMeta, String input) throws RestClientException, UnsupportedEncodingException {
		
		try {
		input = rest.getForEntity("http://censor/censor?input="
				+URLEncoder.encode(input,"UTF-8"),
				String.class).getBody();
		}
		catch (Exception e) {
			input=e.getMessage();
		}
		
		return "Censoring version\n"
				+ "Instance UUID is:" + uuid.toString() + "\n"
				+ "Input: " + input + "\n"
				+ "Client IP: " + reqMeta.getRemoteAddr() + "\n"
				+ "Server IP:" + reqMeta.getLocalAddr() + "\n";
	}
}
