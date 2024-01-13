package com.devsuperior.demo.controllers;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.services.EventService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @PutMapping(value = "/{id}")
    public ResponseEntity<EventDTO> update(@PathVariable long id, @RequestBody EventDTO dto){
        try {
            dto = service.update(id, dto);
            return ResponseEntity.ok(dto);
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }
}
