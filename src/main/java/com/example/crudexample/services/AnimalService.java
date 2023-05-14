package com.example.crudexample.services;

import com.example.crudexample.entities.Animal;
import com.example.crudexample.repositary.AnimalRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    AnimalRepositary animalRepositary;
    public List<Animal> getAnimals(){
        List<Animal> animals = new ArrayList<Animal>();
        Iterable<Animal> rawAnimals = animalRepositary.findAll();
        for (Animal rawAnimal : rawAnimals){
            animals.add(rawAnimal);
        }
        return animals;
    }
    public Animal getAnimal(Long id){
        Optional<Animal> optAnimal = animalRepositary.findById(id);
        return optAnimal.get();
    }
    public void saveAnimal(Animal animal){
        animalRepositary.save(animal);
    }
    public void deleteAnimal(Long id){
        animalRepositary.deleteById(id);
    }
    public void updateAnimal(Long id, Animal animal){
        animal.setId(id);
        animalRepositary.save(animal);
    }

}
