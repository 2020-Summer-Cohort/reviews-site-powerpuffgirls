package org.wecancodeit.reviews.storage;
//

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.entities.Reviews;
import org.wecancodeit.reviews.storage.repositories.ReviewRepository;
//


@Service
public class ReviewStorage {

    ReviewRepository reviewRepo;

    public ReviewStorage(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public Reviews findReviewsByShowTitle(String showTitle) {
        return reviewRepo.findByShowTitle(showTitle);
    }

    public Iterable<Reviews> findAllReviews() {
        return reviewRepo.findAll();
    }

    public void save(Reviews reviews) {
        reviewRepo.save(reviews);
    }


}


