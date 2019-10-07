package com.wildcodeschool.myProjectAboutDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectAboutDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectAboutDoctorApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "<ul> <a href=\"/doctor/1\"><li>doctor 1</li></a> <a href=\"/doctor/2\"><li>doctor 2</li></a> <a href=\"/doctor/3\"><li>doctor 3</li></a> <a href=\"/doctor/4\"><li>doctor 4</li></a> </ul>";
	}

	@GetMapping("/doctor/1")
	@ResponseBody
	public String displayDoctor1() {
		return "William Hartnell";
	}

	@GetMapping("/doctor/2")
	@ResponseBody
	public String displayDoctor2() {
		return "Patrick Troughton";
	}

	@GetMapping("/doctor/3")
	@ResponseBody
	public String displayDoctor3() {
		return "Jon Pertwee";
	}

	@GetMapping("/doctor/4")
	@ResponseBody
	public String displayDoctor4() {
		return "Tom Baker";
	}



}
