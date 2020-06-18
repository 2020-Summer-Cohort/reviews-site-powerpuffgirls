package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {


    CategoryStorage categoryStorage;

        public CategoryController(CategoryStorage categoryStorage){

            this.categoryStorage = categoryStorage;
        }
        @RequestMapping("categories")
        public String showAllCategories(Model model){
            model.addAttribute("categoryNames", categoryStorage.findAllCategories());
            return "categories-template";
        }

        @RequestMapping("categories/{categoryName}")
        public String showAdultAnimationShows(Model model, @PathVariable String categoryName){
            model.addAttribute("category", categoryStorage.findCategoriesByName(categoryName));
            return "sub-category-template";// category template th: text h1 element
    }

//        @RequestMapping("categories/kidscategorynames")
//        public String showKidsCartoonShows(Model model){
//            model.addAttribute("kidscategories", categoryStorage.findCategoriesByName("Kids Cartoons").getShows());
//            return "kidscartoons-template";
//        }

//         @RequestMapping("categories/hashtags")
//            public String showAllHashtags(Model model){
//            model.addAttribute("hashtagNames", hashtagsStorage.findAllHashtags());
//            return "hashtags-template";
//    }

}
