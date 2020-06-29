package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.entities.BlogPosts;
import org.wecancodeit.reviews.storage.CategoryStorage;
import org.wecancodeit.reviews.storage.BlogPostStorage;
import org.wecancodeit.reviews.entities.Hashtags;
import org.wecancodeit.reviews.storage.HashtagsStorage;

@Controller
public class BlogController {


    private BlogPostStorage blogPostStorage;
    private HashtagsStorage hashtagsStorage;
    private CategoryStorage categoryStorage;


    public BlogController(BlogPostStorage blogPostStorage, HashtagsStorage hashtagsStorage) {
        this.blogPostStorage = blogPostStorage;
        this.hashtagsStorage = hashtagsStorage;
    }


    @RequestMapping("blogPosts/{postTitle}")
    public String showSingleReview(@PathVariable String postTitle, Model model) {
        model.addAttribute("blogPosts", blogPostStorage.findReviewsByPostTitle(postTitle));

        return "blogpost-template";
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
        BlogPosts blogPosts = blogPostStorage.findReviewsByPostTitle(postTitle);
        blogPosts.addHashtag(hashtagToAdd);
        blogPostStorage.save(blogPosts);
        return "redirect:/blogPosts/" + postTitle;
    }

    @PostMapping("hashtags/delete")
    public String deleteHashtags(long hashtagId, String postTitle) {
        Hashtags hashtagsToRemove = hashtagsStorage.findById(hashtagId);
        BlogPosts blogPosts = blogPostStorage.findReviewsByPostTitle(postTitle);
        blogPosts.removeHashtag(hashtagsToRemove);
        blogPostStorage.save(blogPosts);
        return "redirect:/blogPosts/" + postTitle;
    }

//    @PostMapping("post/add")
//    public String addNewPost(String title, String body, String authors, String tags, String categoryName) {
//        Categories postCategory = categoryStorage.findCategoriesByName(categoryName);
//        Collection<Hashtags> postTags = new ArrayList<Hashtags>();
//        postTags.add (hashtagsStorage.findById(hashtagId));
//        Collection<AuthorC> postAuthors = new ArrayList<AuthorC>();
//        postAuthors.add(AuthorStorage.findbyName(postAuthors));
//        Post postToAdd = new Post(title, body, postAuthors, postTags, postCategory);
//        ReviewStorage.save(postToAdd);
//        return "redirect:/categories/" + postCategory.getName();
//    }

}
