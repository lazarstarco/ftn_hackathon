package rs.ftn.edu.hackatonbackend.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.ftn.edu.hackatonbackend.dto.UserDto;
import rs.ftn.edu.hackatonbackend.entity.Teacher;
import rs.ftn.edu.hackatonbackend.model.ApiResponse;
import rs.ftn.edu.hackatonbackend.service.TeacherService;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @PostMapping(path = "/login", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> loginTeacher(@RequestBody UserDto loginInfo) {
        if (!this.teacherService.existsByUsernameAndPassword(loginInfo.getUsername(), loginInfo.getPassword())) {
            return ResponseEntity.badRequest().body(new ApiResponse(
                    Timestamp.valueOf(LocalDateTime.now()),
                    400,
                    "Teacher does not exist",
                    "/api/v1/teachers"
            ));
        }
        return ResponseEntity.ok(new ApiResponse(
                Timestamp.valueOf(LocalDateTime.now()),
                200,
                "Login successful",
                "/api/v1/teachers"
        ));
    }

    @PostMapping(path = "/login", consumes = {MediaType.APPLICATION_JSON_VALUE}
            , produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> registerTeacher(@RequestBody Teacher teacher) {
        if (this.teacherService.findTeacherByUsername(teacher.getUsername()) == null) {
            return ResponseEntity.badRequest().body(new ApiResponse(
                    Timestamp.valueOf(LocalDateTime.now()),
                    400,
                    "Teacher already exist",
                    "/api/v1/teachers"
            ));
        }
        this.teacherService.saveTeacher(teacher);
        return ResponseEntity.ok(new ApiResponse(
                Timestamp.valueOf(LocalDateTime.now()),
                200,
                "Login successful",
                "/api/v1/teachers"
        ));
    }
}