package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    CategoriesRepository categoriesRepo;
    ShowsRepository showsRepo;
    CategoryStorage categoryStorage = new CategoryStorage(categoriesRepo);
    ShowStorage showStorage = new ShowStorage(showsRepo);
//    HashtagsStorage hashtagsStorage = new HashtagsStorage();

        @RequestMapping("categories")
        public String showAllCategories(Model model){
            model.addAttribute("categoryNames", categoryStorage.findAllCategories());
            return "categories-template";
        }

        @RequestMapping("categories/adultcategorynames")
        public String showAdultAnimationShows(Model model){
            model.addAttribute("adultcategories", showStorage.findAllAdultAnimationShowNames());
            return "adultanimation-template";
    }

        @RequestMapping("categories/kidscategorynames")
        public String showKidsCartoonShows(Model model){
            model.addAttribute("kidscategories", showStorage.findAllKidsShowNames());
            return "kidscartoons-template";
        }

//         @RequestMapping("categories/hashtags")
//            public String showAllHashtags(Model model){
//            model.addAttribute("hashtagNames", hashtagsStorage.findAllHashtags());
//            return "hashtags-template";
//    }

}
