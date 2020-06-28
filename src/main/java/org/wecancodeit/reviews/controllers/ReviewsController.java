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


    public ReviewsController(ReviewStorage reviewStorage, HashtagsStorage hashtagsStorage) {
        this.reviewStorage = reviewStorage;
        this.hashtagsStorage = hashtagsStorage;
    }


    @RequestMapping("reviews/{postTitle}")
    public String showSingleReview(@PathVariable String postTitle, Model model) {
        model.addAttribute("reviews", reviewStorage.findReviewsByPostTitle(postTitle));

        return "review-template";
    }

    @RequestMapping("hashtags/{hashtagID}")
    public String showReviewsAssociatedWithHashtag(@PathVariable Long hashtagID, Model model) {
        model.addAttribute("hashtag", hashtagsStorage.findById(hashtagID));
        return "hashtags-template"; //need to make a new template and insert instead
    }

    @PostMapping("hashtags/add")
    public String addNewHashtag(String hashtagName, String postTitle) {
        Hashtags hashtagToAdd = new Hashtags(hashtagName);
        hashtagsStorage.saveHashtags(hashtagToAdd);
        Reviews reviews = reviewStorage.findReviewsByPostTitle(postTitle);
        reviews.addHashtag(hashtagToAdd);
        reviewStorage.save(reviews);
        return "redirect:/reviews/" + postTitle;
    }

    @PostMapping("hashtags/delete")
    public String deleteHashtags(long hashtagId, String postTitle) {
        Hashtags hashtagsToRemove = hashtagsStorage.findById(hashtagId);
        Reviews reviews = reviewStorage.findReviewsByPostTitle(postTitle);
        reviews.removeHashtag(hashtagsToRemove);
        reviewStorage.save(reviews);
        return "redirect:/reviews/" + postTitle;
    }

}
