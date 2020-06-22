package org.wecancodeit.reviews;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.awt.image.BufferedImage;

@Entity
public class Reviews {
    @Id
    @GeneratedValue
    private long id;
    private int showRating;
    private String airDate;
    @Lob
    private String description;
    private BufferedImage image;
    private String showTitle;
    @ManyToMany
    private Collection<Hashtags> hashtags;

    protected Reviews(){}

    public Reviews(String showTitle, Integer showRating, String airDate, String description, BufferedImage image, Hashtags... hashtags){
        this.showTitle = showTitle;
        this.showRating = showRating;
        this.airDate = airDate;
        this.description = description;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }

    public BufferedImage getImage() {
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

    public String getShowTitle() {
        return showTitle;
    }

    public Collection<Hashtags> getHashtags() {
        return hashtags;
    }
}