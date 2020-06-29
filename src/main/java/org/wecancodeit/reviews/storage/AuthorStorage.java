package org.wecancodeit.reviews.storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.entities.AuthorC;
import org.wecancodeit.reviews.entities.Hashtags;
import org.wecancodeit.reviews.storage.repositories.AuthorRepository;
import org.wecancodeit.reviews.storage.repositories.HashtagsRepository;
@Service
public class AuthorStorage {
    AuthorRepository authorRepo;

    public AuthorStorage(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    public Iterable<AuthorC> findAllAuthorC(){
        return authorRepo.findAll();
    }

    public AuthorC findPostsByAuthor(String authorName) {
        return authorRepo.findPostByAuthor(authorName);
    }

    public void saveAuthorName(AuthorC authorC) {
        authorRepo.save(authorC);
    }

    public void removeAuthorName(AuthorC authorC) {
        authorRepo.delete(authorC);
    }
}