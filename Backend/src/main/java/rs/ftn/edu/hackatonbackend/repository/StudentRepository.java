package rs.ftn.edu.hackatonbackend.repository;

import org.springframework.stereotype.Repository;
import rs.ftn.edu.hackatonbackend.entity.Student;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    boolean existsByUsernameAndPassword(String username, String password);

    Student findStudentByUsername(String username);
}
