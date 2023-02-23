package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
      @Autowired
      repo serviceRepo;
      @Autowired
      StudentService service;

      @GetMapping("/getval")
      List<details> getList (){
    	  return serviceRepo.findAll();
      }
      
      @PostMapping("/post")
      public details create(@RequestBody details det) {
    	  return serviceRepo.save(det);
      }
      @GetMapping("/getval/{id}")
      public Optional<details> getbyid(@PathVariable int id){
    	  return service.getStudent(id);
      }
      @PutMapping("/details")
      public String update(@RequestBody details det) {
    	  return service.updateDetails(det);
      }
      @DeleteMapping("/student")
  	public String delete(@RequestParam int id) {
  		return service.deleteDetails(id);
  	}
      
}
