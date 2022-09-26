package com.lucianobrito.hrworker.resources;

import com.lucianobrito.hrworker.entities.Worker;
import com.lucianobrito.hrworker.repositories.WorkerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@AllArgsConstructor
public class WorkerResource {

    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = repository.findAll();
        return ResponseEntity.ok().body(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable("id") Long id) {
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok().body(worker);
    }

}
