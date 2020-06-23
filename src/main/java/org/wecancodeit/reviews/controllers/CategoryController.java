package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.storage.CategoryStorage;

@Controller
public class CategoryController {


    CategoryStorage categoryStorage;

    public CategoryController(CategoryStorage categoryStorage) {

        this.categoryStorage = categoryStorage;
    }

    @RequestMapping("categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categoryNames", categoryStorage.findAllCategories());
        return "categories-template";
    }

    @RequestMapping("categories/{categoryName}")
    public String showAdultAnimationShows(Model model, @PathVariable String categoryName) {
        model.addAttribute("category", categoryStorage.findCategoriesByName(categoryName));
        return "sub-category-template";// category template th: text h1 element
    }
}