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

//        hashtagsStoragePPGirls = new LinkedList<>();
//        hashtagsStoragePPGirls.add(new HashtagsStorage("funny"));
//        hashtagsStoragePPGirls.add(new HashtagsStorage("kids"));
//
//        reviews.put("Power Puff Girls", new Reviews("PowerPuff Girls", 3, "November 18, 1998", "This was my favorite show " +
//                "growing up! I always wanted to be a power\\n\" +\n" +
//                "                    \"            puff girl. I loved their tenacity and the show has great villains.", "./Powerpuff.jpg",
//                hashtagsStoragePPGirls));
//
//        hashtagStorageStevenUniverse = new LinkedList<>();
//        hashtagStorageStevenUniverse.add(new HashtagsStorage("kids"));
//        hashtagStorageStevenUniverse.add(new HashtagsStorage("funny"));
//
//        reviews.put("Steven Universe", new Reviews("Steven Universe", 5, "November 4, 2013 - Final season January 2019",
//                "Is honestly a great animated series for all ages. It tackles everyday issues with such depth and complexity that children " +
//                        "can digest and adults can fully grasp. In terms of characters is one the most diverse shows on television in racial and LGBT " +
//                        "representation. Perfectly blending themes of love,trauma and growth realistically. My personal favorite part of the series is the " +
//                        "allusion to 90's Japanese RPG's and Shojo series.", "./steven-universe.png", hashtagStorageStevenUniverse));

    }

    //ADD OTHER REVIEWS

//        public Reviews findReviewByTitle (String showTitle){
//            return reviews.get(showTitle);
//        }
//
//        public Reviews findReviewByHashtag (String hashtagName){
//        return reviews.get(hashtagName);
//    }

        public Iterable<Reviews> findAllReviews() {
        return reviewRepo.findAll();
    }
    }


