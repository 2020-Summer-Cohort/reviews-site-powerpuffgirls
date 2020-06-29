package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.AuthorC;
import org.wecancodeit.reviews.entities.Categories;

public interface AuthorRepository extends CrudRepository <AuthorC,Long>{
    default AuthorC findPostByAuthor(String authorName) {
        return null;
    }

}
//public interface CategoriesRepository extends CrudRepository<Categories, Long> {
//    Categories findByName(String name);
//}