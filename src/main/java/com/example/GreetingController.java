package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by v-dev on 29/5/2016.
 * Controller for handling the greetings
 */
@Controller
public class GreetingController {

  @RequestMapping("/greeting")
  public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World")
                           String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }
}
