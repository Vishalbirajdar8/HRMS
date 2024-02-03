package com.HRMS.HRMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.HRMS.Entity.Trainer;
import com.HRMS.HRMS.repository.TrainerRepository;

@Service
public class TrainerService {
	@Autowired
	
	TrainerRepository trainerrepository;
	
	public Trainer createTrainer(Trainer trainer) {
		return trainerrepository.save(trainer);
	}
	public Trainer getTrainerById(int id) {
		return trainerrepository.findById(id).get();
}
	public List <Trainer> getAllTrainer(){
		return trainerrepository.findAll();
	}
	public String deleteTrainerById(int id) {
		trainerrepository.deleteById(id);
		return "deletion successfull";
		
	}
	public Trainer updateTrainerById(Trainer correcttrainer,int id) {
		Trainer trainer = trainerrepository.findById(id).get();
		if(trainer.getTraining_name()!=null) {
			trainer.setTraining_name(correcttrainer.getTraining_name());
			
		}
		return trainerrepository.save(trainer);
		
	}

}
