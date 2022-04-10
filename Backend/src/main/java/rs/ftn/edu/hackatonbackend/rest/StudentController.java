package rs.ftn.edu.hackatonbackend.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ftn.edu.hackatonbackend.dto.UserDto;
import rs.ftn.edu.hackatonbackend.entity.Student;
import rs.ftn.edu.hackatonbackend.model.ApiResponse;
import rs.ftn.edu.hackatonbackend.service.StudentService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Resource
    private StudentService studentService;

    @PostMapping(path = "/login", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> loginStudent(@RequestBody UserDto loginInfo) {
        if (!this.studentService.existsByUsernameAndPassword(loginInfo.getUsername(), loginInfo.getPassword())) {
            return ResponseEntity.badRequest().body(new ApiResponse(
                    Timestamp.valueOf(LocalDateTime.now()),
                    400,
                    "User does not exist",
                    "/api/v1/students"
            ));
        }
        return ResponseEntity.ok(new ApiResponse(
                Timestamp.valueOf(LocalDateTime.now()),
                200,
                "Login successful",
                "/api/v1/students"
        ));
    }

    @PostMapping("/register")
    public ResponseEntity<Object> registerStudent(@RequestBody Student student) {
        if (this.studentService.findStudentByUsername(student.getUsername()) != null ) {
            return ResponseEntity.badRequest().body(new ApiResponse(
                    Timestamp.valueOf(LocalDateTime.now()),
                    400,
                    "User already exist",
                    "/api/v1/students"
            ));
        }
        studentService.saveStudent(student);
        return ResponseEntity.ok(new ApiResponse(
                Timestamp.valueOf(LocalDateTime.now()),
                200,
                "User created",
                "/api/v1/students"
        ));

    }
}
