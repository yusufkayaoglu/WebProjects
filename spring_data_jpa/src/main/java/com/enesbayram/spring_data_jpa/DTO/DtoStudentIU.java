package com.enesbayram.spring_data_jpa.DTO;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Bu sınıf ınsert ve update işlemlerinde kullanılacaktır.
public class DtoStudentIU {
//    @NotEmpty(message = "Firstname alanı boş bırakılamaz!")
//    @Min(value = 3)
//    @Max(value = 10)
    private String firstName;

//    @Size(min = 3, max = 30)
    private String lastName;

    private Date birthOfDate;

//    @Email(message = "Email formatında bir adres giriniz!")
    private String email;

//    @Size(min = 11, max = 11,message = "TCKN alanı 11 karakter olmalıdır!")
    //@NotEmpty(message = "TCKN alanı boş geçilemez!")
    private String tckn;

}

//Validation
//Genel Kültür
/*
* String firstName;         -->Blank
* String firstName = "";    -->Empty
* String firstName =null;   -->Null
* */