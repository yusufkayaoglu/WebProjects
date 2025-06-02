package com.enesbayram.spring_data_jpa.services;

import com.enesbayram.spring_data_jpa.DTO.DtoStudent;
import com.enesbayram.spring_data_jpa.DTO.DtoStudentIU;
import com.enesbayram.spring_data_jpa.entities.Student;

import java.util.List;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU student);    //Kaydederken tüm bilgileri alırsın,fakat dönerken yalnızca ad ve soyad bilgilerini dönersin
    public List<DtoStudent> getStudents();
    public DtoStudent getStudentById(Integer id);
    public void deleteStudentById(Integer id);
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
