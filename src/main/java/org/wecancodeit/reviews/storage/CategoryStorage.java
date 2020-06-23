package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.entities.Categories;
import org.wecancodeit.reviews.storage.repositories.CategoriesRepository;

@Service
public class CategoryStorage {

    private CategoriesRepository categoriesRepo;

    public CategoryStorage(CategoriesRepository categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }

    public Categories findCategoriesByName(String name) {
        return categoriesRepo.findByName(name);
    }

    public Iterable<Categories> findAllCategories() {
        return categoriesRepo.findAll();
    }
}



