package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ANSWERS")
public class Answer {

    @Id
    private int id;

    @Column(name = "ANSWER")
    private String questionAnswer;

    @Column(name = "QUESTION_ID")
    private int questionId;

    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;

    @Column(name = "IS_CORRECT")
    private boolean isCorrect;
}
