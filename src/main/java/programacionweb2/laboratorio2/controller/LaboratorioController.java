package programacionweb2.laboratorio2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaboratorioController {

    @GetMapping("/")
    public String menu(){
        return "menu";
    }

    @GetMapping("/s")
    public String s(){
        return "s";
    }

    @GetMapping("/o")
    public String o(){
        return "o";
    }

    @GetMapping("/l")
    public String l(){
        return "l";
    }
    @GetMapping("/i")
    public String i(){
        return "i";
    }
    @GetMapping("/d")
    public String d(){
        return "d";
    }
}
