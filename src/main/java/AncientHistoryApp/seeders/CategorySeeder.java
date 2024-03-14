package AncientHistoryApp.seeders;

import AncientHistoryApp.model.entity.Article;
import AncientHistoryApp.model.entity.Category;
import AncientHistoryApp.model.entity.enums.CategoryNameEnum;
import AncientHistoryApp.repository.CategoryRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategorySeeder implements CommandLineRunner {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategorySeeder(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.categoryRepository.count() == 0) {
            List<Category> categories = Arrays.stream(CategoryNameEnum.values())
                    .map(Category::new)
                    //.map(type -> new Category())
                    .collect(Collectors.toList());
            this.categoryRepository.saveAllAndFlush(categories);
        }
    }
}