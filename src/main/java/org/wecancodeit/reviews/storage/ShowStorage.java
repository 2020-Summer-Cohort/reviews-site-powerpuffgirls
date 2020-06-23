package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.ShowsRepository;
import org.wecancodeit.reviews.entities.Shows;

@Service
public class ShowStorage {

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

