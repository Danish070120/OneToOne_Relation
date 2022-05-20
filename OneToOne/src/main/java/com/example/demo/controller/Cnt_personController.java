package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cnt_person;
import com.example.demo.service.Cnt_personService;

@RestController
public class Cnt_personController {
	@Autowired
	private Cnt_personService cnt_personService;

	@PostMapping("/person")

	public String insertCnt_person(@RequestBody Cnt_person cnt_person) {
		cnt_personService.saveCnt_person(cnt_person);
		return "Your record is save succesfully";
	}

	@GetMapping("/allperson")
	public List<Cnt_person> fetchCnt_personList() {
		return cnt_personService.fetchCnt_personList();
	}
	
	@PutMapping("/person/{id}")
	public Cnt_person updateCnt_person(@RequestBody Cnt_person cnt_person,@PathVariable("id") int id) {
		return cnt_personService.updateCnt_person(cnt_person, id);
	}
	
	@DeleteMapping("/person/{id}")
	
	public String deleteCnt_personid(@PathVariable("id") int id ) {
		cnt_personService.deleteCnt_personid(id);
		return "Deleted successfully";
	}
}
