package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.BlogName;

public interface ShowsRepository extends CrudRepository<BlogName, Long> {
    BlogName findByPostTitle(String postTitle);
}
