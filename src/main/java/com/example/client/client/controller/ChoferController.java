package com.example.client.client.controller;

import com.example.client.client.Chofer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChoferController {

    @GetMapping("/choferes")
    public ModelAndView getAllChoferes(){
        ModelAndView modelAndView = new ModelAndView("test");
        RestTemplate restTemplate = new RestTemplate();
        Chofer[] choferes = restTemplate.getForObject("http://190.171.154.163:82/api/Chofer", Chofer[].class);
        modelAndView.addObject("choferes", choferes);
        return modelAndView;
    }

    @DeleteMapping("/choferes/delete")
    public ModelAndView deleteChofer(@RequestParam(value = "Rut") String rut){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete("http://190.171.154.163:82/api/Chofer?Rut="+rut);
        ModelAndView modelAndView = new ModelAndView("eliminado");
        return modelAndView;
    }
}
