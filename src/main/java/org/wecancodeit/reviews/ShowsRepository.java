package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface ShowsRepository extends CrudRepository<Shows, Long> {
    Shows findByTitle(String showTitle);
}
