package in.nithin.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreekRestController {
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/greek")
	public String getMsg() {
		return  msg;
	}

}
