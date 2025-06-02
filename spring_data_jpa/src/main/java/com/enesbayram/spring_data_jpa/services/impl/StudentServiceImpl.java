package com.enesbayram.spring_data_jpa.services.impl;

import com.enesbayram.spring_data_jpa.DTO.DtoCourse;
import com.enesbayram.spring_data_jpa.DTO.DtoStudent;
import com.enesbayram.spring_data_jpa.DTO.DtoStudentIU;
import com.enesbayram.spring_data_jpa.entities.Course;
import com.enesbayram.spring_data_jpa.entities.Student;
import com.enesbayram.spring_data_jpa.repository.StudentRepository;
import com.enesbayram.spring_data_jpa.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        //DtoStudentIU içindeki değerleri studenta kopyala
        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbStudent = studentRepository.save(student);
        //Döneceğimiz response student tipinde değil dolayısıyla dbStudent responseye yani dtoStudent nesnesine dönüştürülür.
        BeanUtils.copyProperties(dbStudent, response);
        return response;

    }

    @Override
    public List<DtoStudent> getStudents() {
        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();
        for (Student student : studentList) {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
//        DtoStudent dto = new DtoStudent();
//        Optional<Student> optional = studentRepository.findById(id);
//        if(optional.isPresent()){
//            Student dbStudent = optional.get();
//            BeanUtils.copyProperties(dbStudent, dto);
//        }
//        return dto;


        //ManyToMany ilişkisi için:
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student>optional = studentRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent, dtoStudent);

        if(dbStudent.getCourses()!=null && !dbStudent.getCourses().isEmpty()){
            for(Course course : dbStudent.getCourses()){
                DtoCourse dtoCourse = new DtoCourse();
                BeanUtils.copyProperties(course, dtoCourse);

                dtoStudent.getCourses().add(dtoCourse);
            }

        }
        return dtoStudent;








    }

    @Override
    public void deleteStudentById(Integer id) {
        Optional<Student>optional = studentRepository.findById(id);
        if(optional.isPresent()){
            studentRepository.delete(optional.get());
        }
    }
    @Override
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU) {
        DtoStudent dto = new DtoStudent();

       Optional<Student>optional =  studentRepository.findById(id);
       if(optional.isPresent()){
           Student dbStudent = optional.get();

           dbStudent.setFirstName(dtoStudentIU.getFirstName());
           dbStudent.setLastName(dtoStudentIU.getLastName());
           dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
           Student updatedStudent = studentRepository.save(dbStudent);
           BeanUtils.copyProperties(updatedStudent, dto);
            return dto;

       }
       return null;
    }
}
