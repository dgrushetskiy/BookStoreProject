package ru.gothmog.ws.entity;

import javax.persistence.*;

@Entity
@Table(name = "author", schema = "book_dbo")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "first_name",length = 100)
    private String firstName;
    @Column(name = "last_name",length = 100)
    private String lastName;

    public String getFullName (){
        return getFirstName() + " " + getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
