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
@Table(name = "GAMES")
public class Game {

    @Id
    private int id;

    private int player1Id;

    private int player2Id;

    private int gamePropsId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gamePropsId", referencedColumnName = "id")
    private GameProps gameProps;

}
