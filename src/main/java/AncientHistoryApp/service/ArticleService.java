package AncientHistoryApp.service;

import AncientHistoryApp.model.service.ArticleServiceModel;
import AncientHistoryApp.model.view.ArticleDetailsViewModel;
import AncientHistoryApp.model.view.ArticleViewModel;

import java.util.List;

public interface ArticleService {
    List<ArticleViewModel>findAllArticlesView();

    void addNewArticle(ArticleServiceModel articleServiceModel);

    ArticleDetailsViewModel findArticleBId(Long id);
}
