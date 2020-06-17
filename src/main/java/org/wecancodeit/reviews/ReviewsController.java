package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewsController {
        Map<String, Reviews> hashtags = new HashMap<>();

        public ReviewsController(){
            Reviews review1 = new Reviews("Powerpuff Girls", 5 , "November 1998", "This was" +
                    " my favorite show growing up! I always wanted to be a power puff girl. I loved their tenacity and the show has great villains",
                    "powerpuff-girls.png", "" );
            Reviews review2 = new Reviews("Steven Universe",5,"November 2013","Is honestly a great animated series for all ages. It tackles\n" +
                    " everyday issues with such depth and complexity that children can\n" +
                    " digest and adults can fully grasp. In terms of characters is one the\n" +
                    " most diverse shows on television in racial and LGBT representation.\n" +
                    " Perfectly blending themes of love,trauma and growth realistically.\n" +
                    " My personal favorite part of the series is the allusion to 90's\n" +
                    " Japanese RPG's and Shojo series.", "steven-universe.png", Collection <hashtags);


        }

}

//    Map<String, Campus> campuses = new HashMap<>();

//    public CampusController(){
//        Book book1 =new Book("Head First Java", "Kathy Sierra", "4440333044-2","Good book to learn Java.");
//        Book book2 =new Book("Test Driven Development by Example", "Kent Beck", "44443333044-2","Good book to learn TDD.");
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(book1);
//        books.add(book2);
//
//        campuses.put("Columbus", new Campus("Columbus", "North Campus", books));
//    }
//
//    @RequestMapping("campuses/{campusName}")
//    public String showSingleCampus(@PathVariable String campusName, Model model){
//        model.addAttribute("campus", campuses.get(campusName));
//        return "campus-template";
//    }
//}
