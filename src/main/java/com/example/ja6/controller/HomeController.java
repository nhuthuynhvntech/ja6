package com.example.ja6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"/","/home/index"})
    public String home(){
        return "redirect:/product/list";

    }
    @RequestMapping({"/admin","/admin/home/index"})
    public String admin(){
        return "redirect:/admin/index";
    }

    @RequestMapping("/ad")
    public String ad(){
        return "/admin/index";
    }
    @RequestMapping("/cc")
    public String ac(){
        return "/admin/cc";
    }
    @RequestMapping("/cl")
    public String cl(){
        return "/admin/chonlop";
    }
    @RequestMapping("/kh")
    public String cf(){
        return "/admin/khoahoc";
    }
    @RequestMapping("/quantri")
    public String quantri(){
        return "/admin/trangquantri";
    }
    @RequestMapping("/lophoc")
    public String lophoc(){
        return "/admin/lophoc";
    }
    @RequestMapping("/ct-lop")
    public String ctlop(){
        return "/admin/hoc-sinh-chi-tiet-lop-hoc";
    }

    @RequestMapping("/ct-khoa")
    public String ctkhoa(){
        return "/admin/hoc-sinh-chi-tiet-khoa-hoc";
    }

}
