package rs.ftn.edu.hackatonbackend.service;

import org.springframework.stereotype.Service;
import rs.ftn.edu.hackatonbackend.entity.Topic;
import rs.ftn.edu.hackatonbackend.repository.TopicRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TopicService {

    @Resource
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        return (List<Topic>) this.topicRepository.findAll();
    }
}
