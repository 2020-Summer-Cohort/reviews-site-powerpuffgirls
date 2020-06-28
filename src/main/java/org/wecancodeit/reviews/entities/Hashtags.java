package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;


//public class Hashtags extends Reviews {
//    private String hashtagName;
//
//    public Hashtags(String hashtagName, String showTitle, Integer showRating, String airDate, String description) {
//        super(showTitle, showRating, airDate, description);
//        this.hashtagName = hashtagName;
//    }
//
//}

@Entity
public class Hashtags {

    @Id
    @GeneratedValue
    private long id;
    private String hashtagName;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<BlogPosts> reviews;


    protected Hashtags() {
    }

    public Hashtags(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public Collection<BlogPosts> getReviews() {
        return reviews;
    }
}

