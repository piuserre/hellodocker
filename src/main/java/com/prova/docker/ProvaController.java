package com.prova.docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvaController {
	
	@GetMapping("/")
	public ResponseEntity<String> prova() {
		
		return ResponseEntity.ok("Hi Man");
	}

}
