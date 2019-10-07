package com.wildcodeschool.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
		@RequestMapping("/")
		@ResponseBody
		public String index() {
		    return 
		    		"<ul>"
		    		 +"<li><a href='https://en.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a></li>"
		    		 +"<li><a href='https://en.wikipedia.org/wiki/Patrick_Troughton'>Patrick Troughton</a></li>"
		    		 +"<li><a href='https://en.wikipedia.org/wiki/Jon_Pertwee'>Jon Pertwee</a></li>"
		    		 +"<li><a href='https://en.wikipedia.org/wiki/Tom_Baker'>Tom Baker</a></li>"
		    		+"</ul>";
	
		}
		@RequestMapping("/Doctor/<1>")
		@ResponseBody
		public String index1() {
		    return "William Hartnell";
		}
		@RequestMapping("/Doctor/<2>")
		@ResponseBody
		public String index2() {
		    return "Patrick Troughton";
	
		}
		@RequestMapping("/Doctor/<3>")
		@ResponseBody
		public String index3() {
			return "Jon Pertwee";
	
		}
		@RequestMapping("/Doctor/<4>")
		@ResponseBody
		public String index4() {
			return "Tom Baker";
	
		}
}
