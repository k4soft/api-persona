package co.com.k4soft.apipersona.service.impl;

import co.com.k4soft.apipersona.entity.Persona;
import co.com.k4soft.apipersona.entity.TipoDocumento;
import co.com.k4soft.apipersona.repository.PersonaRepository;
import co.com.k4soft.apipersona.repository.TipoDocumentoRepository;
import co.com.k4soft.apipersona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<Persona> findAll(){
        return personaRepository.findAll();
    }

    @Override
    public void insert(Persona persona) {
        persona.setTipoDocumento(tipoDocumentoRepository.findById(1).orElse(null));
        personaRepository.save(persona);
    }

    @Override
    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }

}
