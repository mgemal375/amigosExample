package com.example.amigosExample.StudentServices;

import com.example.amigosExample.Model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(new Student(
                1L,
                "Sebri",
                "Sebri.gemal@gmail.com",
                LocalDate.of(1998, Month.MAY,29),
                23
        ));
    }
}
