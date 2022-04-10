package rs.ftn.edu.hackatonbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.edu.hackatonbackend.entity.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer> {
}
