package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Manager;

public interface ManagerRepository extends JpaRepository<Manager ,Long>
{

}
