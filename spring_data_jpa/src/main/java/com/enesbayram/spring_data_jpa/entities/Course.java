package com.enesbayram.spring_data_jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    @Id
    private Long id;

    private String name;


}
