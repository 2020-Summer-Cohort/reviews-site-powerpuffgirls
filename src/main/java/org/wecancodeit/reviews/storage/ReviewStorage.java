package org.wecancodeit.reviews.storage;
//

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.entities.BlogPosts;
import org.wecancodeit.reviews.storage.repositories.BlogPostsRepository;
//


@Service
public class ReviewStorage {

    BlogPostsRepository reviewRepo;

    public ReviewStorage(BlogPostsRepository reviewRepo) {
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


