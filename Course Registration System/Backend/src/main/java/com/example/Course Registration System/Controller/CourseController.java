package com.example.Course.Registration.System.Controller;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping("/")
    public String home(){
        return service.gethome();
    }

    @GetMapping("/courses")
    public List<Course> first(){
        return service.getCourseList();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> second(){
        return service.getenrolledList();
    }

    @PostMapping("/courses/register")
    public String third(@RequestParam("name") String name,
                        @RequestParam("email") String email,
                        @RequestParam("coursename") String coursename){
        service.getregisteredlist(name,email,coursename);
        return "Congraluation "+name+" Enrollment successfully for "+coursename;
    }


}
