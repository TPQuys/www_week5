package vn.edu.iuh.fit.frontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Home {
    @GetMapping("")
    public String home(){return "home";}

}
