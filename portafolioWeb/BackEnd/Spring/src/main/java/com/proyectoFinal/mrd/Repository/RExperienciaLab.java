package com.proyectoFinal.mrd.Repository;


import com.proyectoFinal.mrd.Entity.ExperienciaLab;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

@Repository
public interface RExperienciaLab extends JpaRepository<ExperienciaLab, Integer>{
    public Optional<ExperienciaLab> findByNombreExp(String nombreExp);
    public boolean existsByNombreExp(String nombreExp);
    
}
