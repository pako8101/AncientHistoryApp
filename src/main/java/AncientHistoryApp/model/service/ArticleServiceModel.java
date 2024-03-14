package AncientHistoryApp.model.service;

import AncientHistoryApp.model.entity.Picture;
import AncientHistoryApp.model.entity.User;
import AncientHistoryApp.model.entity.enums.CategoryNameEnum;
import AncientHistoryApp.model.entity.enums.PeriodEnum;

import java.util.Set;

public class ArticleServiceModel {

    private Long id;

    private PeriodEnum category;

    private String name;
    private User author;

    private String description;
    private Set<Picture> pictures;

    private Set<CategoryNameEnum>categories;

    public ArticleServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PeriodEnum getCategory() {
        return category;
    }

    public void setCategory(PeriodEnum category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }

    public Set<CategoryNameEnum> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryNameEnum> categories) {
        this.categories = categories;
    }
}
