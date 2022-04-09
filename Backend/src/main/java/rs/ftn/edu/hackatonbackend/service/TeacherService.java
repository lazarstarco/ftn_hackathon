package rs.ftn.edu.hackatonbackend.service;

import rs.ftn.edu.hackatonbackend.entity.Student;
import rs.ftn.edu.hackatonbackend.repository.TeacherRepository;

import javax.annotation.Resource;

public class TeacherService {

    @Resource
    private TeacherRepository teacherRepository;

    public boolean existsByUsernameAndPassword(String username, String password){
        return this.teacherRepository.existsByUsernameAndPassword(username, password);
    }

    public Student findStudentByUsername(String username) {
        return this.teacherRepository.findTeacherByUsername(username);
    }
}
