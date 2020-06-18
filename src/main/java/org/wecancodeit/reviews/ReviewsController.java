package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;
@Controller
public class ReviewsController {

        Map<String, Reviews> reviews = new HashMap<>();
        private ReviewStorage reviewStorage;

        public ReviewsController(ReviewStorage reviewStorage) {
          this.reviewStorage = reviewStorage;
        }
            @RequestMapping("reviews/{showTitle}")
            public String showSingleReview(@PathVariable String showTitle, Model model){
//            model.addAttribute("reviews", reviewStorage.findReviewByTitle(showTitle));
            return "review-template";
    }

            @RequestMapping("reviews/{hashtagName}")
            public String showReviewsAssociatedWithHashtag(@PathVariable String hashtagName, Model model){
//            model.addAttribute("reviews", reviewStorage.findReviewByHashtag(hashtagName));
            return "review-template"; //need to make a new template and insert instead
    }

        }


