package board.springjpaboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Reply {

    @Id @GeneratedValue
    @Column(name = "reply_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    private String description;

    //댓글은 수정할 수 없음
    public Reply(Member member, Board board, String description) {
        this.member = member;
        this.board = board;
        this.description = description;
    }
}
