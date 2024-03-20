package AncientHistoryApp.service;

import AncientHistoryApp.model.entity.Category;
import AncientHistoryApp.model.entity.enums.CategoryNameEnum;

public interface CategoryService {

    Category findCategoryByName(CategoryNameEnum categoryNameEnum);

}
