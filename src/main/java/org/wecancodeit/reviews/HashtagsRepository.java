package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Hashtags;

public interface HashtagsRepository extends CrudRepository<Hashtags, Long> {
    Hashtags findHashtagsByReviews(String hashtagName);

}
