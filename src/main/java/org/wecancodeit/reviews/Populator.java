package org.wecancodeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        Shows show1 = new Shows("Powerpuff Girls", category2);
        Shows show2 = new Shows("Steven Universe", category2);
        Shows show3 = new Shows("Superjail", category1);
        Shows show4 = new Shows("Afro Samurai", category1);
        showsRepo.save(show1);
        showsRepo.save(show2);
        showsRepo.save(show3);
        showsRepo.save(show4);

        Hashtags hashtag1 = new Hashtags("#funny");
        Hashtags hashtag2 = new Hashtags("#violent");
        Hashtags hashtag3 = new Hashtags("#kids");
        hashtagsRepo.save(hashtag1);
        hashtagsRepo.save(hashtag2);
        hashtagsRepo.save(hashtag3);

        Reviews review1 = new Reviews(show1, 3, "November 18, 1998", "ppg desc.",
                "./powerpuff-girls.png", hashtag1, hashtag3);
        Reviews review2 = new Reviews(show2, 5, "November 4, 2013", "steven universe desc.", "./steven-universe.png", hashtag1, hashtag3);
        Reviews review3 = new Reviews(show3, 5, "September 28, 2008", "Good show", "./superjail.jpg",
                hashtag1);
        Reviews review4 = new Reviews(show4, 4, "January 4, 2007", "Afro Samurai desc ", "./afro-samurai.png", hashtag2);

        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);
        reviewRepo.save(review4);

    }
}

