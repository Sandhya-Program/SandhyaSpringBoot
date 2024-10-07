package com.sandhya.sandhyaspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
   @RequestMapping("/api")
   @GetMapping

   public String test()
   {
    return "This is just for fun!!";
   } 
}
