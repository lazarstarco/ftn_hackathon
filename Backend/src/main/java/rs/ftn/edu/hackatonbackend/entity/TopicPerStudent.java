package rs.ftn.edu.hackatonbackend.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TOPICS_PER_STUDENT")
@NoArgsConstructor
public class TopicPerStudent {

    @EmbeddedId
    private TopicsPerStudentCompositeKey topicsPerStudentCompositeKey;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "STUDENT_ID")
    private Student studentId;

    @ManyToOne
    @MapsId("topicId")
    @JoinColumn(name = "TOPIC_ID")
    private Student student;

    public TopicPerStudent(TopicsPerStudentCompositeKey topicsPerStudentCompositeKey) {
        this.topicsPerStudentCompositeKey = topicsPerStudentCompositeKey;
    }



}
