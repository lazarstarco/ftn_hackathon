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
@Table(name = "GAME_PROPS")
public class GameProps {

    @Id
    private int id;

    @Column(name = "PLAYER_ONE_SCORE")
    private int playerOneScore;

    @Column(name = "PLAYER_TWO_SCORE")
    private int playerTwoScore;

    @Column(name = "IS_OPEN")
    private boolean isOpen;

    @Column(name = "IS_COMPLETED")
    private boolean isCompleted;

    @OneToOne(mappedBy = "gameProps")
    private Game game;
}
