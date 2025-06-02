package com.enesbayram.spring_data_jpa.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoDepartment {
    private Long id;

    private String departmentName;
}
