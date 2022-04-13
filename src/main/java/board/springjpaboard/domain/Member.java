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

    @Column(name = "username", unique = true)
    private String name;
    private int age;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Degree degree;

    public void setMember(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
