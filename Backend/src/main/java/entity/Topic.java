package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TOPICS")
public class Topic {

    @Id
    private int id;

    @Column(name = "TOPIC_NAME")
    private String topicName;

    @ManyToMany(mappedBy = "topics")
    private List<Student> students;

    @OneToMany(mappedBy = "topic")
    private List<Question> topicQuestions;


}
