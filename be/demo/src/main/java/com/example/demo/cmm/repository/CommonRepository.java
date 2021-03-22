package com.example.demo.cmm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.cmm.domain.Common;

interface CommonCustomRepository {
	
}

public interface CommonRepository extends JpaRepository<Common, Long>,
										   CommonCustomRepository{

}
