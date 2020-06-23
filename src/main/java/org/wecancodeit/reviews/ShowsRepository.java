package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Shows;

public interface ShowsRepository extends CrudRepository<Shows, Long> {
    Shows findByShowTitle(String showTitle);
}
