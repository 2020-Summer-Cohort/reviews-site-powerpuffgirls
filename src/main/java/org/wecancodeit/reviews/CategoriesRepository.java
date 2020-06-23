package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Categories;

public interface CategoriesRepository extends CrudRepository<Categories, Long> {
            Categories findByName(String name);
        }

