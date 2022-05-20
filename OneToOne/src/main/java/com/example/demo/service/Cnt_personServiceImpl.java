package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cnt_person;
import com.example.demo.repository.Cnt_personRepository;

@Service
public class Cnt_personServiceImpl implements Cnt_personService {

	@Autowired
	private Cnt_personRepository cnt_personRepository;
	private Iterable<? extends Integer> id;

	@Override
	public Cnt_person saveCnt_person(Cnt_person cnt_person) {
		return cnt_personRepository.save(cnt_person);
	}

	@Override
	public List<Cnt_person> fetchCnt_personList() {
		return (List<Cnt_person>) cnt_personRepository.findAll();
	}

	@Override
	public Cnt_person updateCnt_person(Cnt_person cnt_person, int id) {

		return cnt_personRepository.save(cnt_person);
	}

	@Override
	public void deleteCnt_personid(int id) {
		// TODO Auto-generated method stub
		cnt_personRepository.deleteById(id);
	}

}
