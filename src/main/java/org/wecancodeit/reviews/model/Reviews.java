package org.wecancodeit.reviews.model;

import org.wecancodeit.reviews.ReviewRepository;

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
    private int showRating;
    private String airDate;
    @Lob
    private String description;
    private String imageUrl;
    private String showTitle;
    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected Reviews() {
    }

    public Reviews(String showTitle, Integer showRating, String airDate, String description, String imageUrl, Hashtags... hashtags) {
        this.showTitle = showTitle;
        this.showRating = showRating;
        this.airDate = airDate;
        this.description = description;
        this.imageUrl = imageUrl;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public String getImageUrl() {
        return imageUrl;
    }


    public int getShowRating() {
        return showRating;
    }

    public String getAirDate() {
        return airDate;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public String getShowTitle() {
        return showTitle;
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
}