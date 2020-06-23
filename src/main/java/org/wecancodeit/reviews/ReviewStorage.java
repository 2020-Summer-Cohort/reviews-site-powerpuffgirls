package org.wecancodeit.reviews;
//
import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.model.Hashtags;
import org.wecancodeit.reviews.model.Reviews;
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

//    public void saveHashtags(Hashtags hashtags){
//        reviewRepo.save(hashtags);
//    }
//     public void addCampus(Campus campus) {
//        campusRepo.save(campus);
//    }

    }


