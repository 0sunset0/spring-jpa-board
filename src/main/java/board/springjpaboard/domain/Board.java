package board.springjpaboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Board {

    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private String title;
    @Lob
    private String description;
    private Long hit;
    private LocalDateTime postTime;

    public void setBoard(Member member, Category category, String title, String description, Long hit, LocalDateTime postTime) {
        this.member = member;
        this.category = category;
        this.title = title;
        this.description = description;
        this.hit = hit;
        this.postTime = postTime;
    }
}
