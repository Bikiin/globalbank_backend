package com.api.form;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.entities.Form;

@SpringBootApplication
public class FormApplication {

	@PostMapping("/")
	public ResponseEntity postController(@RequestBody JSONObject obForm) {
		Form form = new Form(obForm);
		return ResponseEntity.ok(form.toJson());
	}
	public static void main(String[] args) {
		SpringApplication.run(FormApplication.class, args);
	}

}
