package org.wecancodeit.reviews;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Reviews {
    @Id
    @GeneratedValue
    private long id;
    private int showRating;
    private String airDate;
    private String description;
    private String image;
    @ManyToOne
    private Shows showTitle;
    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected Reviews(){}

    public Reviews(Shows showTitle, Integer showRating, String airDate, String description, String image, Hashtags... hashtags){
        this.showTitle = showTitle;
        this.showRating = showRating;
        this.airDate = airDate;
        this.description = description;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public String getImage() {
        return image;
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

    public Shows getShowTitle() {
        return showTitle;
    }

    public Collection<Hashtags> getHashtags() {
        return hashtags;
    }
}