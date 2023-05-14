package com.example.crudexample.controllers;


import com.example.crudexample.entities.Animal;
import com.example.crudexample.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Repository > Service > Controller
@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;
    @PostMapping(path = "/animal")
    public void saveAnimal(@RequestBody Animal animal){
        animalService.saveAnimal(animal);
    }

    @GetMapping(path = "/animal/{id}")
    public Animal getAnimal(@PathVariable Long id) {
        return animalService.getAnimal(id);
    }

    @GetMapping(path = "/animal")
    public List<Animal> getAnimals() {
        return animalService.getAnimals();
    }

    @PutMapping(path = "/animal/{id}")
    public void updateAnimal(@PathVariable Long id,@RequestBody Animal animal){
         animalService.updateAnimal(id,animal);
    }

    @DeleteMapping(path = "/animal/{id}")
    public void deleteAnimal(@PathVariable Long id){
        animalService.deleteAnimal(id);
    }




}
