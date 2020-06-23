package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.model.Shows;

@Service
public class ShowStorage {
//
//    List<String> adultShowNames;
//    List<String> kidsShowNames;
//
//    public ShowStorage() {
//        adultShowNames = new ArrayList<>();
//        adultShowNames.add("Superjail");
//        adultShowNames.add("Afro Samurai");
//
//        kidsShowNames = new ArrayList<>();
//        kidsShowNames.add("Powerpuff Girls");
//        kidsShowNames.add("Steven Universe");
//
//    }

    private ShowsRepository showsRepo;

    public ShowStorage(ShowsRepository showsRepo) {
        this.showsRepo = showsRepo;
    }

    public Shows findShowsByName(String title) {
        return showsRepo.findByShowTitle(title);
    }

    public Iterable<Shows> findAllShows() {
        return showsRepo.findAll();
    }



}

