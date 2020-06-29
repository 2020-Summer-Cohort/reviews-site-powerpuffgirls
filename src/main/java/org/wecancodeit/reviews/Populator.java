package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.entities.*;
import org.wecancodeit.reviews.storage.repositories.*;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    CategoriesRepository categoriesRepo;
    @Autowired
    BlogPostsRepository reviewRepo;
    @Autowired
    ShowsRepository showsRepo;
    @Autowired
    HashtagsRepository hashtagsRepo;
    @Autowired
    AuthorRepository authorRepo;

    @Override
    public void run(String... args) throws Exception {
        Categories currentCategory = new Categories("Current Events");
        Categories fishCategory = new Categories("Fish Blogs");
        Categories plantCategory = new Categories("Plants Blogs");
        categoriesRepo.save(currentCategory);
        categoriesRepo.save(fishCategory);
        categoriesRepo.save(plantCategory);
//        BlogName blog1 = new BlogName("Man In Tree", currentCategory);
        BlogName blog2 = new BlogName("Weird Dream 2", currentCategory);
        BlogName Blog3 = new BlogName("New Neighbor", currentCategory);
        BlogName show6 = new BlogName("Poecilia reticulata", fishCategory);
        BlogName show7 = new BlogName("Apistogramma", fishCategory);
        BlogName show8 = new BlogName("Cryptocoryne", plantCategory);
//        showsRepo.save(blog1);
        showsRepo.save(blog2);
        showsRepo.save(Blog3);
        showsRepo.save(show6);
        showsRepo.save(show7);
        showsRepo.save(show8);

        Hashtags hashtag1 = new Hashtags("#funny");
        Hashtags hashtag2 = new Hashtags("#wow");
        Hashtags hashtag3 = new Hashtags("#science");
        hashtagsRepo.save(hashtag1);
        hashtagsRepo.save(hashtag2);
        hashtagsRepo.save(hashtag3);


        BlogPosts review1 = new BlogPosts("Poecilia reticulata", "★★★", "November 18, 1998",
                "My brother got some new guppies today. They are snake skin guppies. They look nice" +
                        " I think the guppies are picking on one of the snails and may kill it. ",
                "/images/guppy.png", hashtag1, hashtag3);

        BlogPosts review2 = new BlogPosts("Apistogramma", "★★★★★", "November 4, 2013",
                "I bought some fish at the local aquarium auction today"+"they are called Apistogramma hongsloi, they are"+
                "most closely related to the Apistogramma panduro"+ "they are nice dwarf cichlids from South America",
                "/images/apistogramma.png", hashtag1, hashtag3);

//        BlogPosts review3 = new BlogPosts("Man in Tree", "★★★★", "September 28, 2008",
//                "Today I saw a man in a tree." +
//                        "  I don't know why this person was in a tree" +
//                        " He was just randomly yelling at the birds in the tree. " +
//                        "Very odd and funny",
//                "/images/manintree.jpg",
//                hashtag1, hashtag2);


        BlogPosts review5 = new BlogPosts("Weird Dream 2", "★★★★", "December 30, 2000",
                "Last Night I had a weird Dream," +
                " It was about a flying dog, " +
                "I haven't been able to sleep since", "/images/wierdDream.jpg" , hashtag1, hashtag2);


        BlogPosts review7 = new BlogPosts("New Neighbor", "★★", "December 2, 2013",
                "A new neighbor moved into the street. Very Cool person" +
                        " They have a nice dog. It's a chow chow. It looks very floofy." +
                        "I hope my dog becomes friends with their dog.",
        "/images/house.jpg", hashtag1);

        BlogPosts review8 = new BlogPosts("Cryptocoryne", "★★★★", "July 17, 1999",
                "Got some new aquarium plants today they are 'Cryptocoryne wendtii' it's a small aquarium plant that's easy to deal with. " +
                        "so far they seem to be growing very well in my tank", "/images/cyrpt.jpg", hashtag1,
                hashtag3);




        reviewRepo.save(review1);
        reviewRepo.save(review2);
//        reviewRepo.save(review3);
        reviewRepo.save(review5);
        reviewRepo.save(review7);
        reviewRepo.save(review8);


        AuthorC author1 = new AuthorC("wofejiiwea");
        authorRepo.save(author1);


    }
}

