package AncientHistoryApp.model.view;

import AncientHistoryApp.model.entity.Picture;
import AncientHistoryApp.model.entity.enums.PeriodEnum;

import java.util.Set;

public class ArticleDetailsViewModel {

    private PeriodEnum period;
    private String title;

    private String content;
    private Set<Picture> pictures;

    public ArticleDetailsViewModel() {
    }

    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
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

    public Set<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(Set<Picture> pictures) {
        this.pictures = pictures;
    }
}
