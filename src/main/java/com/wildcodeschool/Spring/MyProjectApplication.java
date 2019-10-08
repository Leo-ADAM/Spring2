package com.wildcodeschool.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}
		@RequestMapping("/doctor/{number}")
		@ResponseBody
		public Doctor doctor(@PathVariable int number) {
			Doctor doctor9 = new Doctor("Christopher Eccleston", 9);
			Doctor doctor10 = new Doctor("David Tennant", 10);
			Doctor doctor11 = new Doctor("Matt Smith", 11);
			Doctor doctor12 = new Doctor("Peter Capaldi", 12);
			Doctor doctor13 = new Doctor("Jodie Whittaker", 13);
			
		    if(number >= 1 && number <= 8) {
		    	throw new ResponseStatusException(HttpStatus.SEE_OTHER,"Essayez d'autres docteurs");
		    }else if(number > 13 || number < 1) {
		    	throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Impossible de récupérer l'incarnation <numero>");
		    }else {
		    	switch(number) {
		    	case 9:
		    		return doctor9;
		    	case 10:
		    		return doctor10;
		    	case 11:
		    		return doctor11;
		    	case 12:
		    		return doctor12;
		    	case 13:
		    		return doctor13;	
		    	}
		    }
			return null;
		}
}
