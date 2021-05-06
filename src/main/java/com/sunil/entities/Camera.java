package com.sunil.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "camera")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;
    private String cameraName;
    private Long FixedZipCode;

}
