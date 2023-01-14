package com.example.ja6.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "nganhduhoc")
@ToString
public class NganhDuHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String maNganh;
    String tenNganh;








}
