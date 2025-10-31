package com.example.Course.Registration.System.Service;

import com.example.Course.Registration.System.Model.Course;
import com.example.Course.Registration.System.Model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepository;
import com.example.Course.Registration.System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository repo;

    @Autowired
    CourseRegistryRepository core;


    public String gethome() {
        return "Welcome to the Course Registration System";
    }

    public List<Course> getCourseList() {
        return repo.findAll();
    }

    public List<CourseRegistry> getenrolledList() {
        return core.findAll();
    }

    public void getregisteredlist(String name, String emailId, String coursename) {
        CourseRegistry coore = new CourseRegistry(name,emailId,coursename);
        core.save(coore);
    }
}
