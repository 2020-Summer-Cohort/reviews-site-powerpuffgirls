//package org.wecancodeit.reviews;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//    @Controller
//    public class ControllerHashtags {
//        Map<String, Hashtags> hashtags = new HashMap<>();
//
//        public ControllerHashtags(){
//            Hashtags powerPuffGirls = new Hashtags("#Funny","PowerPuff Girls",3,"November 18, 1998","This was my favorite show growing up! I always wanted to be a power\n" +
//                    "            puff girl. I loved their tenacity and the show has great villains.");
////            Book book1 =new Book("Head First Java", "Kathy Sierra", "4440333044-2","Good book to learn Java.");
////            Book book2 =new Book("Test Driven Development by Example", "Kent Beck", "44443333044-2","Good book to learn TDD.");
////            ArrayList<Book> books = new ArrayList<>();
////            books.add(book1);
////            books.add(book2);
//            Hashtags.
//
////            campuses.put("Columbus", new Campus("Columbus", "North Campus", books));
//        }
//
//        @RequestMapping("campuses/{campusName}")
//        public String showSingleCampus(@PathVariable String campusName, Model model){
//            model.addAttribute("campus", campuses.get(campusName));
//            return "campus-template";
//        }
//    }
//}
