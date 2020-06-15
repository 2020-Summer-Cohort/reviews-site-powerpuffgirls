package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    CategoryStorage categoryStorage = new CategoryStorage();
    ShowStorage showStorage = new ShowStorage();
    HashtagsStorage hashtagsStorage = new HashtagsStorage();

        @RequestMapping("categories")
        public String showAllCategories(Model model){
            model.addAttribute("categoryNames", categoryStorage.findAllCategories());
            return "hashtags-template"; //TODO MAKE NEW TEMPLATE
        }

        @RequestMapping("categories/{adultCategoryName}")
        public String showAdultAnimationShows(@PathVariable String adultCategoryName, Model model){
            model.addAttribute("categories", showStorage.findAllAdultAnimationShowNames());
            return "review-template"; //TODO MAKE NEW TEMPLATE

    }

        @RequestMapping("categories/{kidsCategoryName}")
        public String showKidsCartoonShows(@PathVariable String kidsCategoryName, Model model){
            model.addAttribute("categories", showStorage.findAllKidsShowNames());
            return "";// TODO MAKE NEW TEMPLATE
        }

         @RequestMapping("categories/hashtags")
            public String showAllHashtags(@PathVariable String hashtags, Model model){
            model.addAttribute("hashtagNames", hashtagsStorage.findAllHashtags());
            return "hashtags-template";
    }

}
