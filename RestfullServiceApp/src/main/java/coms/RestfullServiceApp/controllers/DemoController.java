package coms.RestfullServiceApp.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import coms.RestfullServiceApp.model.Student;
@RestController
public class DemoController {

	private List<Student>  sall=  new ArrayList<Student>();
	
	@GetMapping(value="/std")
	public ResponseEntity<List<Student>> TestGet()
	{
		return new ResponseEntity<List<Student>>(sall, HttpStatus.OK);
	}
	
	@PostMapping(value="/std")
	public ResponseEntity<String> TestPost(@RequestBody Student  std)
	{
		sall.add(std);
		return new ResponseEntity<String>("New Student Details are added", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/std/{id}")
	public ResponseEntity<Object> TestGet(@PathVariable int id)
	{
		for(Student s : sall)
		{
			if(s.getRollno()==id)
				return new ResponseEntity<Object>(s, HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PutMapping(value="/std/{id}")
	public ResponseEntity<Object> TestPut(@RequestBody Student  std, @PathVariable int id)
	{
		boolean b = false;
		for(Student s : sall)
		{
			if(s.getRollno()==id)
			{
				sall.remove(s);
				b = true;
				break;
			}
		}
		if(b==true)
		{
			sall.add(std);
			return new ResponseEntity<Object>("Student Modifed", HttpStatus.OK);
		}
		
		return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping(value="/std/{id}")
	public ResponseEntity<Object> TestDelete(@PathVariable int id)
	{
		boolean b = false;
		for(Student s : sall)
		{
			if(s.getRollno()==id)
			{
				sall.remove(s);
				b = true;
				break;
			}
		}
		if(b==true)
			return new ResponseEntity<Object>("Student Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<Object>("Student Not Found", HttpStatus.NOT_FOUND);
	}
}
