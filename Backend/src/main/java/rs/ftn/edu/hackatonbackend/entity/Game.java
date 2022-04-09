package rs.ftn.edu.hackatonbackend.entity;

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

    @Column(name = "PLAYER_ONE_ID")
    private int player1Id;

    @Column(name = "PLAYER_TWO_ID")
    private int player2Id;

    @Column(name = "GAME_PROPS_ID")
    private int gamePropsId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "GAME_PROPS_ID", referencedColumnName = "id", insertable = false, updatable = false)
    private GameProps gameProps;

}
