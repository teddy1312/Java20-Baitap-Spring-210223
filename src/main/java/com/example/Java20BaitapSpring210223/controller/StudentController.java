package com.example.Java20BaitapSpring210223.controller;

import com.example.Java20BaitapSpring210223.model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    List<StudentModel> studentList = new ArrayList<>();

    @PostMapping("")
    public ResponseEntity<?> requestParam(@RequestParam String name, @RequestParam int age){
        StudentModel student = new StudentModel();
        student.setName(name);
        student.setAge(age);
        studentList.add(student);

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> pathVariable(@PathVariable String name, @PathVariable int age){
        StudentModel student = new StudentModel();
        student.setName(name);
        student.setAge(age);
        studentList.add(student);

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> requestBody(@RequestBody StudentModel student){
        studentList.add(student);

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

}
