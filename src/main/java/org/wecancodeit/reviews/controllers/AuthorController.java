package org.wecancodeit.reviews.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.AuthorStorage;
import org.wecancodeit.reviews.storage.CategoryStorage;


public class AuthorController {
    AuthorStorage  authorStorage;

    public AuthorController(AuthorStorage authorStorage){
        this.authorStorage=authorStorage;
    }


    @RequestMapping("author")
    public String showAllAuthors(Model model){
        model.addAttribute("authorName",authorStorage.findAllAuthorC());
        return "author-template";
    }

}
