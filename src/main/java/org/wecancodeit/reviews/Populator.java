package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.entities.Categories;
import org.wecancodeit.reviews.entities.Hashtags;
import org.wecancodeit.reviews.entities.Reviews;
import org.wecancodeit.reviews.entities.Shows;
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
        Categories category1 = new Categories("Adult Animation");
        Categories category2 = new Categories("Kids Cartoons");
        categoriesRepo.save(category1);
        categoriesRepo.save(category2);
        Shows show1 = new Shows("Superjail", category1);
        Shows show2 = new Shows("Afro Samurai", category1);
        Shows show3 = new Shows("Aqua Teen Hunger Force", category1);
        Shows show4 = new Shows("South Park", category1);
        Shows show5 = new Shows("Rick and Morty", category1);
        Shows show6 = new Shows("Powerpuff Girls", category2);
        Shows show7 = new Shows("Steven Universe", category2);
        Shows show8 = new Shows("Spongebob Squarepants", category2);
        Shows show9 = new Shows("Avatar: The Last Air Bender", category2);
        showsRepo.save(show1);
        showsRepo.save(show2);
        showsRepo.save(show3);
        showsRepo.save(show4);
        showsRepo.save(show5);
        showsRepo.save(show6);
        showsRepo.save(show7);
        showsRepo.save(show8);
        showsRepo.save(show9);

        Hashtags hashtag1 = new Hashtags("#funny");
        Hashtags hashtag2 = new Hashtags("#violent");
        Hashtags hashtag3 = new Hashtags("#kids");
        hashtagsRepo.save(hashtag1);
        hashtagsRepo.save(hashtag2);
        hashtagsRepo.save(hashtag3);

        Reviews review1 = new Reviews("Powerpuff Girls", "3 out of 5", "November 18, 1998",
                "This was my favorite show growing up! I always wanted to be a power puff girl." +
                        " I loved their tenacity and the show has great villains. ",
                "/images/powerpuffgirlsimage.png", hashtag1, hashtag3);

        Reviews review2 = new Reviews("Steven Universe", "5 out of 5", "November 4, 2013",
                "Honestly a great animated series for all ages. It tackles everyday issues with " +
                        "such depth and complexity that children can digest and adults can fully grasp. In terms" +
                        " of characters is one the most diverse shows on television in racial and LGBT representation." +
                        " Perfectly blending themes of love,trauma and growth realistically. My personal favorite part" +
                        " of the series is the allusion to 90's Japanese RPG's and Shojo series.",
                "/images/steven-universe.png", hashtag1, hashtag3);

        Reviews review3 = new Reviews("Superjail", "5 out of 5", "September 28, 2008",
                "Takes place in another dimension, in an eponymous jail inside of a volcano." +
                        "  Superjail is a psychedelic very violent show that focuses on different" +
                        " aspects of this fictional jail, it mostly operates as a comedy for adults. " +
                        "Themes are often about conflicts between prisoners.",
                "/images/superjail.jpg",
                hashtag1, hashtag2);

        Reviews review4 = new Reviews("Afro Samurai", "4 out of 5", "January 4, 2007",
                " Afro Samurai focuses on a samurai named Afro whose mission is to" +
                        " get the number 1 headband and avenge his father. The setting is somewhat feudal however some " +
                        "characters have androids and other futuristic technology." +
                        " The show focuses on battles between the eponymous character and others who are seeking the headband",
                "/images/afro-samurai.png", hashtag2);

        Reviews review5 = new Reviews("Aqua Teen Hunger Force", "4 out of 5", "December 30, 2000",
                "Aqua Teen Hunger Force also called ATHF," +
                " is a comedy that appeared on adult swim. The show featured main characters Meatwad, " +
                "Mastershake and Frylock as they got into different comedic situations in a fictional universe.", "/images/ATHF.jpg" , hashtag1, hashtag2);

        Reviews review6 = new Reviews("South Park","5 out of 5","August 13, 1997",
                "Truly comedy gold. South Park offers stories based on the current times with a pleasant dark twist." +
                        " I personally love the animation style and the terrible celebrity impersonations.", "/images/SouthPark.jpg", hashtag1, hashtag2 );

        Reviews review7 = new Reviews("Rick and Morty", "2 out of 5", "December 2, 2013",
                "Want to go on a cosmically wacky adventures and visit another dimension?  Rick and Morty is the show for you." +
                        " I truly enjoy the whimsical mind of Rick, the crazy mad scientist, and Morty the shy but spirited kid just " +
                        "looking for fun. Take a peek of what else is out there and take a ride into the universe all while laughing your butt off.",
        "/images/rickANDmorty.jpg", hashtag1);

        Reviews review8 = new Reviews("Spongebob Squarepants", "5 out of 5", "July 17, 1999",
                "The peak of children's entertainment, the stories told throughout this series are too relatable. I have been that fool who ripped their pants." +
                        "I’m happy to let my children watch this show. Not only does it have valuable life lessons but it’s also pretty witty!", "/images/spongebob.jpg", hashtag1,
                hashtag3);

        Reviews review9 = new Reviews("Avatar: The Last Air Bender", "3 out of 5", "Febuary 21, 2005",
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

