package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Cnt_person;

public interface Cnt_personService {
	
	Cnt_person saveCnt_person(Cnt_person cnt_person);
	List<Cnt_person>fetchCnt_personList();
	Cnt_person updateCnt_person(Cnt_person cnt_person, int id);
	void deleteCnt_personid(int id);

}
