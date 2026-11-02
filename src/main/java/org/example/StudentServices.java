package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentServices {
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}