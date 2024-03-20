package AncientHistoryApp.model.entity;

import AncientHistoryApp.model.entity.enums.PeriodEnum;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "articles")
public class Article extends BaseEntity{

    @Column(name = "title",nullable = false,unique = true)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    private User author;

    @Enumerated(EnumType.STRING)
    private PeriodEnum period;

    @DateTimeFormat
    private LocalDate created;

    @OneToMany(mappedBy = "article",fetch = FetchType.EAGER)
    private Set<Picture> pictures;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Category>categories;

    public Article() {
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }
}
