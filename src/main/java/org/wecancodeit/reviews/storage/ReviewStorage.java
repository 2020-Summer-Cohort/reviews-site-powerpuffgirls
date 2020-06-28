package org.wecancodeit.reviews.storage;
//

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.entities.BlogPosts;
import org.wecancodeit.reviews.storage.repositories.ReviewRepository;
//


@Service
public class ReviewStorage {

    ReviewRepository reviewRepo;

    public ReviewStorage(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    public BlogPosts findReviewsByPostTitle(String postTitle) {
        return reviewRepo.findByPostTitle(postTitle);
    }

    public Iterable<BlogPosts> findAllReviews() {
        return reviewRepo.findAll();
    }

    public void save(BlogPosts blogPosts) {
        reviewRepo.save(blogPosts);
    }


}


