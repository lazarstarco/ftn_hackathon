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
@Table(name = "QUESTIONS")
public class Question {

    @Id
    private int id;

    @Column(name = "TOPIC_ID")
    private int topicId;

    @ManyToOne
    @JoinColumn(name = "TOPIC_ID" )
    private Topic topic;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
}
