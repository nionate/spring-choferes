package com.example.client.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class ClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Chofer[] chofer = restTemplate.getForObject("http://190.171.154.163:82/api/Chofer?Rut=000000001", Chofer[].class);
        System.out.println(chofer[0].toString());

        Chofer chofer1 = new Chofer();
        chofer1.setRut("9999999");
        chofer1.setRazon("Test 9999");
        chofer1.setSucursal("CR");
        chofer1.setRutTransporte("9999999");
        chofer1.setOk(true);
        chofer1.setExiste(false);
        chofer1.setMensaje("");

        ResponseEntity<String> result = restTemplate.postForEntity("http://190.171.154.163:82/api/Chofer", chofer1, String.class);
        System.out.println(result.getBody());
    }
}
