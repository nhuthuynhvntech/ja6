package com.example.ja6.service.impl;
import com.example.ja6.entity.LopHoc;
import com.example.ja6.entity.hocSinh;

import java.util.List;

public interface LopHocService {
    List<LopHoc> findALl();
    LopHoc create(LopHoc lopHoc);
}
