package org.wecancodeit.reviews.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.entities.BlogPosts;

public interface BlogPostsRepository extends CrudRepository<BlogPosts, Long> {
            BlogPosts findByPostTitle(String postTitle);
        }


