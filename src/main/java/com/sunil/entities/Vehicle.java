package com.sunil.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long vid;
    private String vehicleName;
    private String vehicleNumber;
    private String StartPoint;
    private String endPoint;

}
