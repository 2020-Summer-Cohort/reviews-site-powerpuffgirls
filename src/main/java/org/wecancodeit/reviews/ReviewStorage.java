package org.wecancodeit.reviews;
//
import org.springframework.stereotype.Service;
//
import java.util.*;

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

    }


