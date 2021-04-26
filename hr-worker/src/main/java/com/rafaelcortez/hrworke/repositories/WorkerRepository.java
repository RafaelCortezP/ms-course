package com.rafaelcortez.hrworke.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcortez.hrworke.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
