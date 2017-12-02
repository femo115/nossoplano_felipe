package com.nossoplano.course;

import java.util.Map;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

	// inject via application.properties
	private String message = "List of Courses";

	@RequestMapping("/courses")
	public String getCourses(Map<String, Object> model) {
		model.put("message", this.message);
		return "/courses/courses";
	}
	
	@RequestMapping("/courses/{value}")
	public String getCourse(Map<String, Object> model) {
		model.put("message", "Matemática");
		return "/courses/course";
	}

}