package rs.ftn.edu.hackatonbackend.service;

import org.springframework.stereotype.Service;
import rs.ftn.edu.hackatonbackend.dto.TopicsPerStudentDto;
import rs.ftn.edu.hackatonbackend.entity.Topic;
import rs.ftn.edu.hackatonbackend.entity.TopicPerStudent;
import rs.ftn.edu.hackatonbackend.entity.TopicsPerStudentCompositeKey;
import rs.ftn.edu.hackatonbackend.repository.TopicRepository;
import rs.ftn.edu.hackatonbackend.repository.TopicsPerStudentRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TopicService {

    @Resource
    private TopicRepository topicRepository;

    @Resource
    private TopicsPerStudentRepository topicsPerStudentRepository;

    public List<Topic> getAllTopics(){
        return (List<Topic>) this.topicRepository.findAll();
    }

    public void saveTopicsPerStudent(TopicsPerStudentDto topicsPerStudentDto) {
        topicsPerStudentDto.getTopicIds().forEach(topic -> topicsPerStudentRepository.save(
                new TopicPerStudent(new TopicsPerStudentCompositeKey(topicsPerStudentDto.getStudentId(), topic))
        ));
    }
}
