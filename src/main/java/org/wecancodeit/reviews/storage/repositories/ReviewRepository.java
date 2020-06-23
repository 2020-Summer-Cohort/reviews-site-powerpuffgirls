package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Reviews;

public interface ReviewRepository extends CrudRepository<Reviews, Long> {
            Reviews findByShowTitle(String showTitle);
        }


