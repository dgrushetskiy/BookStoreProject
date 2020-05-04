package ru.gothmog.ws.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "review",schema = "book_dbo")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "comments",length = 4096)
    private String comments;
    @Column(name = "rating")
    private BigDecimal rating;
    @Column(name = "review_on")
    private LocalDateTime reviewOn;
    @Column(name = "headline",length = 128)
    private String headline;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public LocalDateTime getReviewOn() {
        return reviewOn;
    }

    public void setReviewOn(LocalDateTime reviewOn) {
        this.reviewOn = reviewOn;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
