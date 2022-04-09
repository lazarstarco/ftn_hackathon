package entity;

import javax.persistence.*;

@Entity
@Table(name = "TOPICS_PER_STUDENT")
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



}
