package co.com.k4soft.apipersona.service;

import co.com.k4soft.apipersona.entity.Persona;

import java.util.List;

public interface PersonaService  {
    List<Persona> findAll();

    void insert(Persona persona);

    Persona findById(Long id);

    void update(Persona persona);

    void deleteById(Long id);
}
