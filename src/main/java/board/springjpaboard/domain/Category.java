package board.springjpaboard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private List<Category> childList = new ArrayList<>();

    public void setCategory(String name, Category parent, List<Category> childList) {
        this.name = name;
        this.parent = parent;
        this.childList = childList;
    }
}
