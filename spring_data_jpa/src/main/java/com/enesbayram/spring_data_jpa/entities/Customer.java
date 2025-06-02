package com.enesbayram.spring_data_jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @OneToOne
    //İlk one customer ikinci one addressi gösterir!
    //Customer ilişkinin sahibidir fakat address ilişkinin sahibi değildir!Bu yüzden address sınıfında mappedby kullanmak gerekiyor!!
    private Address address;




}
