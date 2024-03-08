package in.nithin.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nithin.service.WelcomeApiClient;

@RestController
public class AppRestController {

	@Autowired
	private WelcomeApiClient service;

	@GetMapping("/welcome")
	public ResponseEntity<String> getMsg() {
		String msg = "hi";//service.msg();
		return new ResponseEntity<>(msg, HttpStatus.OK);

	}

}
