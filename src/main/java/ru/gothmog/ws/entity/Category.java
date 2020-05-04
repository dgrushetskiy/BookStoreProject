package ru.gothmog.ws.entity;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "book_dbo",
        indexes = {@Index(name = "unq_category_name", columnList = "name", unique = true)}
)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name", length = 100)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
