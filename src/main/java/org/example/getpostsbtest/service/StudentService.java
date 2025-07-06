package org.example.getpostsbtest.service;

import org.example.getpostsbtest.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService {
        List<Student> student=new ArrayList<>(
                Arrays.asList(
                        new Student(01,"Jesi","AI"),
                        new Student(02,"Kann","ECE")
                )
        );
    public List<Student> getStd() {
        return student;
    }

    public Student getStdID(int id) {
        int index=0;
        for(int i=0;i<student.size();i++)
        {
            if(student.get(i).getRollno()==id)
            {
                index=i;
            }
        }
        return student.get(index);
    }

    public void addStudent(Student student) {
        this.student.add(student);
    }


    public String updStud(Student student) {
        int index=0;
        for(int i=0;i<this.student.size();i++)
        {
            if(this.student.get(i).getRollno()==student.getRollno())
            {
                index=i;
                this.student.set(index, student);
                return "student successfully updated";

            }
        }
        return "student not found";
    }
}
