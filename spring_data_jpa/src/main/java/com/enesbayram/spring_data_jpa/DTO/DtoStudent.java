package com.enesbayram.spring_data_jpa.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Get işlemi yaparken bu sınıf kullanılır.
public class DtoStudent {
    private Integer id;
    private String firstName;
    private String lastName;
    private List<DtoCourse> courses = new ArrayList<>();

}
