package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Categories;

public interface CategoriesRepository extends CrudRepository<Categories, Long> {
    Categories findByName(String name);
}

