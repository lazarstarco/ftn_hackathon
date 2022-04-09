package rs.ftn.edu.hackatonbackend.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class TopicsPerStudentCompositeKey implements Serializable {

    @Column(name = "STUDENT_ID")
    private int studentId;

    @Column(name = "TOPIC_ID")
    private int topicId;
}
