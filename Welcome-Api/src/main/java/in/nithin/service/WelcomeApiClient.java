package in.nithin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greek")
public interface WelcomeApiClient {

	@GetMapping("/greek")
	public String msg();
}
