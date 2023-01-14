package com.example.ja6.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "chonlop")
@ToString
public class chonLop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String maHocSinh;
    String maLop;


}
