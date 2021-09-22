package com.coding.test.controller;

import com.coding.test.model.Dog;
import com.coding.test.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/breeds/list")
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/all")
    public Dog getAll(){
        return dogService.getAll();
    }
}
