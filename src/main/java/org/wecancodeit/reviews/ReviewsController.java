package org.wecancodeit.reviews;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ReviewsController {

    //        Map<String, Reviews> reviews = new HashMap<>();
    private ReviewStorage reviewStorage;
    private HashtagsStorage hashtagsStorage;

    public ReviewsController(ReviewStorage reviewStorage, HashtagsStorage hashtagsStorage) {
        this.reviewStorage = reviewStorage;
        this.hashtagsStorage = hashtagsStorage;
    }


    @RequestMapping("reviews/{showTitle}")
    public String showSingleReview(@PathVariable String showTitle, Model model) {
        model.addAttribute("reviews", reviewStorage.findReviewsByShowTitle(showTitle));
//                model.addAttribute("adultcategories", categoryStorage.findCategoriesByName(categoryName).getShows());
        return "review-template";
    }

    @RequestMapping("hashtags/{hashtagID}")
    public String showReviewsAssociatedWithHashtag(@PathVariable Long hashtagID, Model model) {
        model.addAttribute("hashtag", hashtagsStorage.findById(hashtagID));
        return "hashtags-template"; //need to make a new template and insert instead
    }

}


