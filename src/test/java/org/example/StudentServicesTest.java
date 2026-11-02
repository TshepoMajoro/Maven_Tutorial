package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServicesTest {
    @Test
    public void StudentServices_GetAllStudents_Empty(){
        //Arrange
        StudentServices studentServices = new StudentServices();
        //Act
        List<Student> allStudents = studentServices.getAllStudents();
        //Assert
        assertEquals(0,allStudents.size());
    }

    @Test
    public void StudentServices_GetAllStudents_Populated(){
        //Arrange
        StudentServices studentServices = new StudentServices();
        Student stu = new Student(1,"Karabo");
        //Act
        studentServices.addStudent(stu);
        List<Student> allStudents = studentServices.getAllStudents();
        boolean isItEmpty = allStudents.isEmpty();
        //Assert
        assertEquals(1,allStudents.size());
        assertFalse(isItEmpty);
    }

    @Test
    public void StudentServices_AddOneStudent(){
        //Arrange
        StudentServices studentServices = new StudentServices();
        Student stu = new Student(1,"Karabo");
        //Act
        studentServices.addStudent(stu);
        //Assert
        assertEquals( 1, studentServices.getAllStudents().get(0).id);
        assertEquals( "Karabo", studentServices.getAllStudents().get(0).name);
    }

}