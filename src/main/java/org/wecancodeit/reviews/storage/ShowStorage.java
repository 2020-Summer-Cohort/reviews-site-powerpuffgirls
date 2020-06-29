package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.storage.repositories.ShowsRepository;
import org.wecancodeit.reviews.entities.BlogName;

@Service
public class ShowStorage {

    private ShowsRepository showsRepo;

    public ShowStorage(ShowsRepository showsRepo) {
        this.showsRepo = showsRepo;
    }

    public BlogName findShowsByName(String title) {
        return showsRepo.findByPostTitle(title);
    }

    public Iterable<BlogName> findAllShows() {
        return showsRepo.findAll();
    }


}

