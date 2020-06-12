package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;
@Controller
public class ReviewsController {

        Map<String, Reviews> reviews = new HashMap<>();

        public ReviewsController(){
            reviews.put("Head First Java", new Reviews("PowerPuff Girls",3,"November 18, 1998","This was my favorite show growing up! I always wanted to be a power\\n\" +\n" +
                    "                    \"            puff girl. I loved their tenacity and the show has great villains.","Powerpuff.jpg","#funny"));
//            reviews.put("Test Driven Development by Example", new Book("Test Driven Development by Example", "Kent Beck", "44443333044-2","Good book to learn TDD."));
//            System.out.println("Worked");

        }
}
