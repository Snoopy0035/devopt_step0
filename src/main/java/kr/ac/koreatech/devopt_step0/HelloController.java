package kr.ac.koreatech.devopt_step0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {
  
  @GetMapping("/")
  public String index() {
    System.out.println("x:Hello.....");
      return "index.html";
  }
  

}
