package fiap.devops.cicd.labcicd.controllers;

import fiap.devops.cicd.labcicd.models.Task;
import fiap.devops.cicd.labcicd.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository repo;

    @GetMapping
    public List<Task> findAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable Integer id) {
        Task taskFound = repo.findById(id).orElse(null);
        if (taskFound == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(taskFound);
    }

    @PostMapping
    public ResponseEntity<Task> createNew(@RequestBody Task task) {
        repo.save(task);
        return ResponseEntity.created(URI.create("/task/" + task.getId())).body(task);
    }

}
