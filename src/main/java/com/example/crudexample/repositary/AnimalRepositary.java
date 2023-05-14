package com.example.crudexample.repositary;

import com.example.crudexample.entities.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepositary extends CrudRepository<Animal, Long> {


}
