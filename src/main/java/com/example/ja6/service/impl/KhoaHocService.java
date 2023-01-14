package com.example.ja6.service.impl;
import com.example.ja6.entity.KhoaHoc;
import com.example.ja6.entity.hocSinh;

import java.util.List;

public interface KhoaHocService {
    List<KhoaHoc> findALl();
    KhoaHoc create(KhoaHoc khoaHoc);
}
