package com.example.API.Controller;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")

public class APIController {
	
	 @GetMapping("/currentdateandtime")
	    public String getCurrentDateTime() {
	        return "Current Date and Time: " + LocalDateTime.now();
	    }

	    @PostMapping("/employee")
	    public String createEmployee() {
	        return "Employee created";
	    }

	    @PutMapping("/employee")
	    public String updateEmployee() {
	        return "Employee updated";
	    }

	    @DeleteMapping("/employee")
	    public String deleteEmployee() {
	        return "Employee deleted";
	    }


}
