package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
      @Autowired
      repo repos;
  
      public Optional<details> getStudent(int id){
	 return repos.findById(id);
	 }
	 
	 public String updateDetails(details det) {
		 repos.save(det);
		 return "Updated";
	 
 }
	 public String deleteDetails(int id) {
			repos.deleteById(id);
			return "Id deleted";
		}
}
