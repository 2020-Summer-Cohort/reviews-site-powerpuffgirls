package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.Hashtags;

public interface HashtagsRepository extends CrudRepository<Hashtags, Long> {

    Hashtags findHashtagsByReviews(String hashtagName);

}
