package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Cnt_person;

public interface Cnt_personRepository extends JpaRepository<Cnt_person, Integer> {

}
