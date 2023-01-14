package com.example.ja6.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "lophoc")
@ToString
public class LopHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String malop;
    String link;
    String chiChu;
    String linkTaiLieu;
    private String name;



}
