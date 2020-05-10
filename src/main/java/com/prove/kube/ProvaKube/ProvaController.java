package com.prove.kube.ProvaKube;

import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvaController {
	
	@GetMapping("/")
	public String prova() {
		
		Properties ps = System.getProperties();
		
		return ps.toString();
	}

}
