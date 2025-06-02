package com.enesbayram.spring_data_jpa.controller.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoStudent;
import com.enesbayram.spring_data_jpa.DTO.DtoStudentIU;
import com.enesbayram.spring_data_jpa.controller.IStudentController;
import com.enesbayram.spring_data_jpa.entities.Student;
import com.enesbayram.spring_data_jpa.repository.StudentRepository;
import com.enesbayram.spring_data_jpa.services.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    //Gerçek hayatta Entity olarak tanımlanan sınıflar parametre olarak kullanılmaz.Bunun yerine DTO sınıfı kullanılır.
    @PostMapping("/save")
    @Override
    public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
        return studentService.saveStudent(dtoStudentIU);
    }

    @GetMapping("/list")
    @Override
    public List<DtoStudent> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/list/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name= "id") Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteStudentById(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") Integer id,@RequestBody DtoStudentIU dtoStudentIU) {
        return studentService.updateStudent(id, dtoStudentIU);
    }


}
