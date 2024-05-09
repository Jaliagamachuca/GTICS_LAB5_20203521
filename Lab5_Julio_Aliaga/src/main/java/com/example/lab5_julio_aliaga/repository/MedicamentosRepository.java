package com.example.lab5_julio_aliaga.repository;

import com.example.lab5_julio_aliaga.entity.Medicamentos;
import com.example.lab5_julio_aliaga.entity.Medicamentos;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentosRepository extends JpaRepository<Medicamentos, Integer> {

}
