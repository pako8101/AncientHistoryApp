package AncientHistoryApp.model.entity;

import AncientHistoryApp.model.entity.enums.PeriodEnum;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

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

}
