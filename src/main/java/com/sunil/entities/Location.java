package com.sunil.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "location")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String address;
    private  Long zipCode;
}
