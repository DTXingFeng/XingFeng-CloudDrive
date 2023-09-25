package xyz.xingfeng.CloudDrive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/home/{id}")
    public String home(@PathVariable String id, Model model) {
        model.addAttribute("id", id);
        return "index"; // 返回Thymeleaf模板
    }
}


