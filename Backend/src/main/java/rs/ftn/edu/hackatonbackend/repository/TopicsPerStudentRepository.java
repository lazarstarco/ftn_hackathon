package rs.ftn.edu.hackatonbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.edu.hackatonbackend.entity.TopicPerStudent;

@Repository
public interface TopicsPerStudentRepository extends CrudRepository<TopicPerStudent, Long> {
}
