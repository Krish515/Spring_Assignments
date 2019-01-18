package com.assignment5.components;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
@RequestMapping("/marks")  
@Controller  
public class TotalController {  
@RequestMapping("/getTotal")  
public String bookingForm(Model model)  
{  
      //create a reservation object   
    Marks mark=new Marks();  
      //provide reservation object to the model   
    model.addAttribute("marks", mark);
    return "mark-page";  
}  
@RequestMapping("/submitForm")  
// @ModelAttribute binds form data to the object  
public String submitForm(@ModelAttribute("marks") Marks mark,@ModelAttribute("marks2") Marks mark2)  
{  
	mark.getResult();
    return "total-page";  
}  
}  