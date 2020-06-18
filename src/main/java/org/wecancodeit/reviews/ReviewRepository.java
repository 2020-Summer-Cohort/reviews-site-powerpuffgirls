package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

        public interface ReviewRepository extends CrudRepository<Reviews, Long> {
            Reviews findByShowTitle(String showTitle);
        }


