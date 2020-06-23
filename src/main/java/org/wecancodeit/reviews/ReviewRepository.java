package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Reviews;

public interface ReviewRepository extends CrudRepository<Reviews, Long> {
            Reviews findByShowTitle(String showTitle);
        }


