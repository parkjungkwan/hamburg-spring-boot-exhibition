package com.example.demo.exh.repository;

import com.example.demo.exh.domain.Exhbn;

import org.springframework.data.jpa.repository.JpaRepository;

interface ExhbnCustomRepository{
	
}
public interface ExhbnRepository extends JpaRepository<Exhbn, Long>, ExhbnCustomRepository {

}
