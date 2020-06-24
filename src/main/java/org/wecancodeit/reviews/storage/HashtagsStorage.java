package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.HashtagsRepository;
import org.wecancodeit.reviews.entities.Hashtags;

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

    public void saveHashtags(Hashtags hashtags) {
        hashtagsRepo.save(hashtags);
    }

    public void removeHashtags(Hashtags hashtags) { hashtagsRepo.delete(hashtags); }
}

