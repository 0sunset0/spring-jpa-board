package board.springjpaboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @OneToMany(mappedBy = "member")
    private List<Board> boardList = new ArrayList<>();

    @Column(name = "username")
    private String name;
    private int age;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Degree degree;

}
