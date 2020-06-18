package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

        public interface CategoriesRepository extends CrudRepository<Categories, Long> {
            Categories findByName(String name);
        }

