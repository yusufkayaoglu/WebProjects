package com.enesbayram.spring_data_jpa.controller;

import com.enesbayram.spring_data_jpa.DTO.DtoStudent;
import com.enesbayram.spring_data_jpa.DTO.DtoStudentIU;
import com.enesbayram.spring_data_jpa.entities.Student;

import java.util.List;

public interface IStudentController {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
    public List<DtoStudent> getStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
