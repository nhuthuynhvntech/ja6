package com.example.ja6.service.impl;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface UpService {

    File save(MultipartFile file, String folder);
}
