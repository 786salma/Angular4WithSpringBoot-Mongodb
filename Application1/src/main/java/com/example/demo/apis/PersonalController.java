package com.example.demo.apis;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Personal;
import com.example.demo.service.PersonalService;

@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
@RestController
@RequestMapping("/api")
public class PersonalController {
	
	@Autowired
	private PersonalService personalService;
	
	@RequestMapping("/getPersonal")
	public List<Personal> getAllPersonal(){
		return personalService.findAll();
	}
	
	
	@RequestMapping(value = "/addPersonal", method = RequestMethod.POST, 
            consumes = "application/json", produces = "application/json")
	public Personal addPersonal(@RequestBody Personal personal) {
		System.out.println(personal.toString());
		return personalService.save(personal);
	}
	

}
	
	/*@RequestMapping("save")
	public void savePersonal() {
		Personal personal= new Personal();
		personal.setId("2");
		personal.setName("salma");
		personalService.savePersonal(personal);
	}
*/

