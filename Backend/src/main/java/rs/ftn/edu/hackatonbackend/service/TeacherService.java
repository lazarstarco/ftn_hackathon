package rs.ftn.edu.hackatonbackend.service;

import org.springframework.stereotype.Service;
import rs.ftn.edu.hackatonbackend.entity.Student;
import rs.ftn.edu.hackatonbackend.entity.Teacher;
import rs.ftn.edu.hackatonbackend.repository.TeacherRepository;

import javax.annotation.Resource;

@Service
public class TeacherService {

    @Resource
    private TeacherRepository teacherRepository;

    public boolean existsByUsernameAndPassword(String username, String password){
        return this.teacherRepository.existsByUsernameAndPassword(username, password);
    }

    public Teacher findTeacherByUsername(String username) {
        return this.teacherRepository.findTeacherByUsername(username);
    }

    public void saveTeacher(Teacher teacher) {
        this.teacherRepository.save(teacher);
    }
}
