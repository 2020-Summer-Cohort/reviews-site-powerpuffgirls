package org.wecancodeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class BlogPosts {
    @Id
    @GeneratedValue
    private long id;
    private String showRating;
    private String dateOfPost;
    @Lob
    private String bodyOfPost;
    private String imageUrl;
    private String postTitle;
    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected BlogPosts() {
    }

    public BlogPosts(String postTitle, String showRating, String dateOfPost, String bodyOfPost, String imageUrl, Hashtags... hashtags) {
        this.postTitle = postTitle;
        this.showRating = showRating;
        this.dateOfPost = dateOfPost;
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

    public String getDateOfPost() {
        return dateOfPost;
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
        BlogPosts blogPosts = (BlogPosts) o;
        return id == blogPosts.id &&
                Objects.equals(hashtags, blogPosts.hashtags);
    }

    public void addHashtag(Hashtags hashtagToAdd) {
        hashtags.add(hashtagToAdd);
    }

    public void removeHashtag(Hashtags hashtagsToRemove) {hashtags.remove(hashtagsToRemove); }
}