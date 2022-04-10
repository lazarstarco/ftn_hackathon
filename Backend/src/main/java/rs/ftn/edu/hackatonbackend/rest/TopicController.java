package rs.ftn.edu.hackatonbackend.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ftn.edu.hackatonbackend.dto.TopicsPerStudentDto;
import rs.ftn.edu.hackatonbackend.entity.Topic;
import rs.ftn.edu.hackatonbackend.service.TopicService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1/topics")
public class TopicController {

    @Resource
    private TopicService topicService;

    @GetMapping
    public ResponseEntity<List<Topic>> getAllTopics(){
        return ResponseEntity.ok(this.topicService.getAllTopics());
    }

    @PostMapping
    public ResponseEntity<Object> insertTopicsPerStudent(@RequestBody TopicsPerStudentDto topicsPerStudentDto) {
        this.topicService.saveTopicsPerStudent(topicsPerStudentDto);
        return ResponseEntity.ok().build();
    }
}
