package com.rafaelcortez.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcortez.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
