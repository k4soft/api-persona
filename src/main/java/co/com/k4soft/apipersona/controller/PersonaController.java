package co.com.k4soft.apipersona.controller;

import co.com.k4soft.apipersona.entity.Persona;
import co.com.k4soft.apipersona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @GetMapping("/personas")
    public List<Persona> findAll(){
        return personaService.findAll();
    }

    @PostMapping("/persona")
    public void insert(@RequestBody Persona persona){
        personaService.insert(persona);
    }

    @GetMapping("/{id}/persona")
    public Persona findById(@PathVariable Long id){
        return personaService.findById(id);
    }

}
