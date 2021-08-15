package controller;

import models.Courses;
import service.CourseService;

import java.util.List;

public class CourseController {
    private CourseService courseService = new CourseService();
    public Courses findCourse(int courseId){
        return courseService.findById(courseId);
    }
    public List<Courses> findAllCourses(){
        return courseService.findAll();
    }
    public void saveCourse(Courses course){
        courseService.saveToDatabase(course);
    }
    public void deleteCourseFromDatabase(int courseCode){
        courseService.deleteCourseFromDatabase(courseCode);
    }

}
