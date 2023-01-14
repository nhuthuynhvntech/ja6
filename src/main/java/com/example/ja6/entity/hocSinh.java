package com.example.ja6.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "hocsinh")
@ToString
public class hocSinh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String maHocSinh;
    String name;
    String email;
    String soDienThoai;

    private boolean status;






}
