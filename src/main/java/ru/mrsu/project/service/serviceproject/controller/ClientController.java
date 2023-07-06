package ru.mrsu.project.service.serviceproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ClientController {

    @GetMapping("/internal/clients/service")
    HashMap<String, Object> getClients() {
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("id", 1);
        hm.put("name", "Tom");
        hm.put("personalNumber", "AAA111");
        hm.put("addressId", 1);
        return hm;
    }
}
