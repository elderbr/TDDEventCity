package com.devsuperior.demo.services;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.entities.Event;
import com.devsuperior.demo.repositories.EventRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    @Transactional
    public EventDTO update(long id, EventDTO dto){
        if(!repository.existsById(id)){
            throw new EntityNotFoundException("Recurso não encontrado!");
        }
        Event event = new Event();
        event.setId(id);
        event.setDate(dto.getDate());
        event.setName(dto.getName());

        event.setCity(new City(dto.getCityId(), null));
        event.setUrl(dto.getUrl());

        return new EventDTO(repository.save(event));
    }
}
