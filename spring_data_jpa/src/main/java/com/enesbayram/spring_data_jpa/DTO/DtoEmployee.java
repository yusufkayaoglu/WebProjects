package com.enesbayram.spring_data_jpa.DTO;

import com.enesbayram.spring_data_jpa.entities.Department;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {
    private Long id;

    private String name;

    private DtoDepartment department;

}
