package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Shows;

public interface ShowsRepository extends CrudRepository<Shows, Long> {
    Shows findByShowTitle(String showTitle);
}
