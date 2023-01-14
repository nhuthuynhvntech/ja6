package com.example.ja6.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "khoahoc")
@ToString
public class KhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String makhoa;
    String tenkhoa;

}
