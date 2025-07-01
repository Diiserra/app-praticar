package br.com.praticar.app_praticar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class AppPraticarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppPraticarApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
	
}
