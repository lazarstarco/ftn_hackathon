package rs.ftn.edu.hackatonbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rs.ftn.edu.hackatonbackend.entity.Student;
import rs.ftn.edu.hackatonbackend.entity.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer > {

    boolean existsByUsernameAndPassword(String username, String password);

    Student findTeacherByUsername(String username);
}
