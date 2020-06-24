package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.ReviewStorage;
import org.wecancodeit.reviews.entities.Hashtags;
import org.wecancodeit.reviews.entities.Reviews;
import org.wecancodeit.reviews.storage.HashtagsStorage;

@Controller
public class ReviewsController {


    private ReviewStorage reviewStorage;
    private HashtagsStorage hashtagsStorage;
    private Hashtags hashtags;

    public ReviewsController(ReviewStorage reviewStorage, HashtagsStorage hashtagsStorage) {
        this.reviewStorage = reviewStorage;
        this.hashtagsStorage = hashtagsStorage;
    }


    @RequestMapping("reviews/{showTitle}")
    public String showSingleReview(@PathVariable String showTitle, Model model) {
        model.addAttribute("reviews", reviewStorage.findReviewsByShowTitle(showTitle));

        return "review-template";
    }

    @RequestMapping("hashtags/{hashtagID}")
    public String showReviewsAssociatedWithHashtag(@PathVariable Long hashtagID, Model model) {
        model.addAttribute("hashtag", hashtagsStorage.findById(hashtagID));
        return "hashtags-template"; //need to make a new template and insert instead
    }

    @PostMapping("hashtags/add")
    public String addNewHashtag(String hashtagName, String showTitle) {
        Hashtags hashtagToAdd = new Hashtags(hashtagName);
        hashtagsStorage.saveHashtags(hashtagToAdd);
        Reviews reviews = reviewStorage.findReviewsByShowTitle(showTitle);
        reviews.addHashtag(hashtagToAdd);
        reviewStorage.save(reviews);
        return "redirect:/reviews/" + showTitle;
    }

    @PostMapping("hashtags/delete")
    public String deleteHashtags(String hashtagName, String showTitle) {
        Hashtags hashtagsToRemove = new Hashtags(hashtagName);
        hashtagsStorage.removeHashtags(hashtagsToRemove);
        Reviews reviews = reviewStorage.findReviewsByShowTitle(showTitle);
        reviews.removeHashtag(hashtagsToRemove);
        reviewStorage.save(reviews);
        hashtagsStorage.saveHashtags(hashtags);
        return "redirect:/reviews/" + showTitle;
    }

}
