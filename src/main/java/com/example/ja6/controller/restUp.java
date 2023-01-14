package com.example.ja6.controller;

import com.example.ja6.service.impl.UpService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.io.File;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/up")
public class restUp {
    @Autowired
    UpService upService;
    @PostMapping("/rest/up/{folder}")
    public JsonNode up(@PathParam("file")MultipartFile file,@PathVariable("folder") String folder){
        File savefile = upService.save(file,folder);

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("name",savefile.getName());
        node.put("size",savefile.length());
        return node;
    }

}
