package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.model.Hashtags;

@Service
public class HashtagsStorage {

    HashtagsRepository hashtagsRepo;

    public HashtagsStorage(HashtagsRepository hashtagsRepo) {
        this.hashtagsRepo = hashtagsRepo;
    }

    public Hashtags findHashtagsByReviews(String hashtagName) {
        return hashtagsRepo.findHashtagsByReviews(hashtagName);
    }

    public Iterable<Hashtags> findAllHashtags() {
        return hashtagsRepo.findAll();
    }

    public Hashtags findById(Long hashtagID) {
        return hashtagsRepo.findById(hashtagID).get();
    }
}

