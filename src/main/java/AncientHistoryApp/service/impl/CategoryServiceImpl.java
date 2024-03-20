package AncientHistoryApp.service.impl;

import AncientHistoryApp.model.entity.Category;
import AncientHistoryApp.model.entity.enums.CategoryNameEnum;
import AncientHistoryApp.repository.CategoryRepository;
import AncientHistoryApp.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category findCategoryByName(CategoryNameEnum categoryNameEnum) {
        return categoryRepository.findByName(categoryNameEnum)
                .orElse(null);
    }
}
