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
        ReviewStorage reviewStorage = new ReviewStorage();

        public ReviewsController() {
            reviews.put("Power Puff Girls", new Reviews("PowerPuff Girls", 3, "November 18, 1998", "This was my favorite show growing up! I always wanted to be a power\\n\" +\n" +
                    "                    \"            puff girl. I loved their tenacity and the show has great villains.", "Powerpuff.jpg", "#funny"));
//            reviews.put("Test Driven Development by Example", new Book("Test Driven Development by Example", "Kent Beck", "44443333044-2","Good book to learn TDD."));
//            System.out.println("Worked");
            reviews.put("Steven Universe", new Reviews("Steven Universe", 5, "November 4, 2013 - Final season January 2019", "Is honestly a great animated series for all ages. It tackles everyday issues with such depth and complexity that children can digest and adults can fully grasp. In terms of characters is one the most diverse shows on television in racial and LGBT representation. Perfectly blending themes of love,trauma and growth realistically. My personal favorite part of the series is the allusion to 90's Japanese RPG's and Shojo series.", "steven-universe.png", "funny, kids"));
        }
            @RequestMapping("reviews/{showTitle}")
            public String showSingleReview(@PathVariable String showTitle, Model model){
            model.addAttribute("reviews", reviewStorage.findReviewByTitle(showTitle));
            return "reviews-template";
    }


        }


