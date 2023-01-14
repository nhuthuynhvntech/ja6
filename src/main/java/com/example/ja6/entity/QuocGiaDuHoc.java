package com.example.ja6.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "quocgiaduhoc")
@ToString
public class QuocGiaDuHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String maQuocGia;
    String tenQuocGia;


}
