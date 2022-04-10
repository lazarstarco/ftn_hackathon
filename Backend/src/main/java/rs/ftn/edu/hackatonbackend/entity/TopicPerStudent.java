package rs.ftn.edu.hackatonbackend.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "TOPICS_PER_STUDENT")
public class TopicPerStudent {

    @EmbeddedId
    private TopicsPerStudentCompositeKey topicsPerStudentCompositeKey;

    @ManyToOne
    @JoinColumn(name = "STUDENT_ID", insertable = false, updatable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "TOPIC_ID", insertable = false, updatable = false)
    private Student topic;

    public TopicPerStudent() {
    }

    public TopicPerStudent(TopicsPerStudentCompositeKey topicsPerStudentCompositeKey) {
        this.topicsPerStudentCompositeKey = topicsPerStudentCompositeKey;
    }


}
