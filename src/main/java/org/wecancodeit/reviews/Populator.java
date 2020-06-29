package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.entities.BlogPosts;
import org.wecancodeit.reviews.entities.Categories;
import org.wecancodeit.reviews.entities.Hashtags;
import org.wecancodeit.reviews.entities.BlogName;
import org.wecancodeit.reviews.storage.repositories.CategoriesRepository;
import org.wecancodeit.reviews.storage.repositories.HashtagsRepository;
import org.wecancodeit.reviews.storage.repositories.ReviewRepository;
import org.wecancodeit.reviews.storage.repositories.ShowsRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    CategoriesRepository categoriesRepo;
    @Autowired
    ReviewRepository reviewRepo;
    @Autowired
    ShowsRepository showsRepo;
    @Autowired
    HashtagsRepository hashtagsRepo;

    @Override
    public void run(String... args) throws Exception {
        Categories category1 = new Categories("Current Events");
        Categories category2 = new Categories("Fish Blogs");
        Categories category3 = new Categories("Plants Blogs");
        categoriesRepo.save(category1);
        categoriesRepo.save(category2);
        categoriesRepo.save(category3);
        BlogName show1 = new BlogName("Man In Tree", category1);
        BlogName show2 = new BlogName("Afro Samurai", category1);
        BlogName show3 = new BlogName("Aqua Teen Hunger Force", category1);
        BlogName show4 = new BlogName("South Park", category1);
        BlogName show5 = new BlogName("Rick and Morty", category1);
        BlogName show6 = new BlogName("Powerpuff Girls", category2);
        BlogName show7 = new BlogName("Steven Universe", category2);
        BlogName show8 = new BlogName("Spongebob Squarepants", category2);
        BlogName show9 = new BlogName("Avatar: The Last Air Bender", category3);
        showsRepo.save(show1);
        showsRepo.save(show2);
        showsRepo.save(show3);
        showsRepo.save(show5);
        showsRepo.save(show6);
        showsRepo.save(show7);
        showsRepo.save(show8);
        showsRepo.save(show9);

        Hashtags hashtag1 = new Hashtags("#funny");
        Hashtags hashtag2 = new Hashtags("#wow");
        Hashtags hashtag3 = new Hashtags("#science");
        hashtagsRepo.save(hashtag1);
        hashtagsRepo.save(hashtag2);
        hashtagsRepo.save(hashtag3);

        BlogPosts review1 = new BlogPosts("Powerpuff Girls", "★★★", "November 18, 1998",
                "This was my favorite show growing up! I always wanted to be a power puff girl." +
                        " I loved their tenacity and the show has great villains. ",
                "/images/powerpuffgirlsimage.png", hashtag1, hashtag3);

        BlogPosts review2 = new BlogPosts("Steven Universe", "★★★★★", "November 4, 2013",
                "Honestly a great animated series for all ages. It tackles everyday issues with " +
                        "such depth and complexity that children can digest and adults can fully grasp. In terms" +
                        " of characters is one the most diverse shows on television in racial and LGBT representation." +
                        " Perfectly blending themes of love,trauma and growth realistically. My personal favorite part" +
                        " of the series is the allusion to 90's Japanese RPG's and Shojo series.",
                "/images/steven-universe.png", hashtag1, hashtag3);

        BlogPosts review3 = new BlogPosts("Man in Tree", "★★★★", "September 28, 2008",
                "Today I saw a man in a tree." +
                        "  I don't know why this person was in a tree" +
                        " He was just randomly yelling at the birds in the tree. " +
                        "Very odd and funny",
                "/images/manintree.jpg",
                hashtag1, hashtag2);

        BlogPosts review4 = new BlogPosts("Afro Samurai", "★★★★", "January 4, 2007",
                " Afro Samurai focuses on a samurai named Afro whose mission is to" +
                        " get the number 1 headband and avenge his father. The setting is somewhat feudal however some " +
                        "characters have androids and other futuristic technology." +
                        " The show focuses on battles between the eponymous character and others who are seeking the headband",
                "/images/afro-samurai.png", hashtag2);

        BlogPosts review5 = new BlogPosts("Aqua Teen Hunger Force", "★★★★", "December 30, 2000",
                "Aqua Teen Hunger Force also called ATHF," +
                " is a comedy that appeared on adult swim. The show featured main characters Meatwad, " +
                "Mastershake and Frylock as they got into different comedic situations in a fictional universe.", "/images/ATHF.jpg" , hashtag1, hashtag2);

        BlogPosts review6 = new BlogPosts("South Park","★★★★★","August 13, 1997",
                "Truly comedy gold. South Park offers stories based on the current times with a pleasant dark twist." +
                        " I personally love the animation style and the terrible celebrity impersonations.", "/images/SouthPark.jpg", hashtag1, hashtag2 );

        BlogPosts review7 = new BlogPosts("Rick and Morty", "★★", "December 2, 2013",
                "Want to go on a cosmically wacky adventures and visit another dimension?  Rick and Morty is the show for you." +
                        " I truly enjoy the whimsical mind of Rick, the crazy mad scientist, and Morty the shy but spirited kid just " +
                        "looking for fun. Take a peek of what else is out there and take a ride into the universe all while laughing your butt off.",
        "/images/rickANDmorty.jpg", hashtag1);

        BlogPosts review8 = new BlogPosts("Spongebob Squarepants", "★★★★", "July 17, 1999",
                "The peak of children's entertainment, the stories told throughout this series are too relatable. I have been that fool who ripped their pants." +
                        "I’m happy to let my children watch this show. Not only does it have valuable life lessons but it’s also pretty witty!", "/images/spongebob.jpg", hashtag1,
                hashtag3);

        BlogPosts review9 = new BlogPosts("Avatar: The Last Air Bender", "★★★", "Febuary 21, 2005",
                " This is my favorite show of all time. The storylines are intricate and the character development is unparalleled compared to similar shows.",
                "/images/ATLAB.jpeg", hashtag1, hashtag3);


        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);
        reviewRepo.save(review4);
        reviewRepo.save(review5);
        reviewRepo.save(review6);
        reviewRepo.save(review7);
        reviewRepo.save(review8);
        reviewRepo.save(review9);


    }
}

