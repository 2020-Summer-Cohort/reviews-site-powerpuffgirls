package org.wecancodeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Reviews {
    @Id
    @GeneratedValue
    private long id;
    private String showRating;
    private String airDate;
    @Lob
    private String bodyOfPost;
    private String imageUrl;
    private String postTitle;
    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected Reviews() {
    }

    public Reviews(String postTitle, String showRating, String airDate, String bodyOfPost, String imageUrl, Hashtags... hashtags) {
        this.postTitle = postTitle;
        this.showRating = showRating;
        this.airDate = airDate;
        this.bodyOfPost = bodyOfPost;
        this.imageUrl = imageUrl;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public String getImageUrl() {
        return imageUrl;
    }


    public String getShowRating() {
        return showRating;
    }

    public String getAirDate() {
        return airDate;
    }

    public String getBodyOfPost() {
        return bodyOfPost;
    }

    public long getId() {
        return id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public Collection<Hashtags> getHashtags() {
        return hashtags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviews reviews = (Reviews) o;
        return id == reviews.id &&
                Objects.equals(hashtags, reviews.hashtags);
    }

    public void addHashtag(Hashtags hashtagToAdd) {
        hashtags.add(hashtagToAdd);
    }

    public void removeHashtag(Hashtags hashtagsToRemove) {hashtags.remove(hashtagsToRemove); }
}