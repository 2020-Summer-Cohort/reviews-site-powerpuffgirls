package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.model.Categories;

@Service
public class CategoryStorage {

//        Map<String, String> categories = new LinkedHashMap<>();
//
//        public CategoryStorage(){
//            categories.put("Adult Animation", "adultcategorynames");
//            categories.put("Kids Cartoons", "kidscategorynames");
//            categories.put("#hashtags", "hashtags");
//
//        }
//
//    public Map<String, String> getCategories() {
//        return categories;
//    }
//
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



