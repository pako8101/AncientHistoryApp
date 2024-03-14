package AncientHistoryApp.model.binding;

import AncientHistoryApp.model.entity.enums.CategoryNameEnum;
import AncientHistoryApp.model.entity.enums.PeriodEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class ArticleAddBindingModel {
    @Size(min = 3,max = 20, message = "Article name must be between 3 and 20 characters")
    @NotEmpty
    private String title;
    @Size(min = 3)
    private String content;
    @NotNull
    private PeriodEnum category;
    private Set<CategoryNameEnum>categories;

    public ArticleAddBindingModel() {
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

    public PeriodEnum getCategory() {
        return category;
    }

    public void setCategory(PeriodEnum category) {
        this.category = category;
    }

    public Set<CategoryNameEnum> getCategories() {
        return categories;
    }

    public void setCategories(Set<CategoryNameEnum> categories) {
        this.categories = categories;
    }
}
