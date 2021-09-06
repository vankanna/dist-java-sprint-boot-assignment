package edu.wctc.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomePage() { return "pages/index"; };
    @RequestMapping("/steps/step-one")
    public String StepOne() { return "pages/steps/step-one"; };
    @RequestMapping("steps/step-two")
    public String StepTwo() { return "pages/steps/step-two"; };
    @RequestMapping("steps/step-three")
    public String StepThree() {return "pages/steps/step-three"; };
}

