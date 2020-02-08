package fiap.devops.cicd.labcicd.repositories;

import fiap.devops.cicd.labcicd.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Integer> {



}
