 package com.HRMS.HRMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.HRMS.Entity.Trainer;
import com.HRMS.HRMS.service.TrainerService;

@RestController
@RequestMapping("/Trainer")
public class TrainerController {
	@Autowired
	
	TrainerService trainerservice;
	
	@PostMapping("/save")
	public Trainer createTrainer(@RequestBody Trainer trainer) {
		return trainerservice.createTrainer(trainer);
	}
	@GetMapping("/find/{id}")
	public Trainer getTrainerById(@PathVariable int id ) {
		return trainerservice.getTrainerById(id);
	}
	@GetMapping("findAll")
	public List <Trainer> getAllTrainer(Trainer trainer){
		return trainerservice.getAllTrainer();
	}
	@DeleteMapping("delete/{id}")
	public String deleteTrainerById(@PathVariable int id ) {
		return trainerservice.deleteTrainerById(id);
	}
	@PutMapping("update/{id}")
	public Trainer updateEmployeeById(@RequestBody Trainer trainer, @PathVariable int id) {
		return null;
		
	}
	
	
	
	

}
