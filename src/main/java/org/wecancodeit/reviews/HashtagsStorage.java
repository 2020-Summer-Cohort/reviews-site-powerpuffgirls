package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

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
}

