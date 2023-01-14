package com.example.ja6.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Service
public class UpImpl implements UpService{
    @Autowired
    ServletContext app;
    public File save(MultipartFile file,String folder){
        File dir = new File((app.getRealPath("/images/" + folder)));
        if(dir.exists()){
            dir.mkdir();

        }
        String s = System.currentTimeMillis()+file.getOriginalFilename();
        String name = Integer.toHexString(s.hashCode())+s.substring(s.lastIndexOf("."));
        try{
            File savefile = new File(dir,name);
            file.transferTo((savefile));
            return savefile;

        }catch (Exception e){
           throw new RuntimeException(e);
        }
    }
}
