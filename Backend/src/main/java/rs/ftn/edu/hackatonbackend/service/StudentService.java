package rs.ftn.edu.hackatonbackend.service;

import org.springframework.stereotype.Service;
import rs.ftn.edu.hackatonbackend.entity.Student;
import rs.ftn.edu.hackatonbackend.repository.StudentRepository;

import javax.annotation.Resource;

@Service
public class StudentService {

    @Resource
    private StudentRepository studentRepository;

    public boolean existsByUsernameAndPassword(String username, String password){
        return this.studentRepository.existsByUsernameAndPassword(username, password);
    }

    public Student findStudentByUsername(String username) {
        return this.studentRepository.findStudentByUsername(username);
    }

    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }
}
