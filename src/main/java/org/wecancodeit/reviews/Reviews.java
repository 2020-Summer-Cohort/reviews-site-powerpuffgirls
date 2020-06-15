package org.wecancodeit.reviews;

import java.util.Collection;

public class Reviews {
    private String showTitle;
    private int showRating;
    private String airDate;
    private String description;
    private String image;
    private Collection<Hashtags> hashTags;

    public Reviews(String showTitle, Integer showRating, String airDate, String description, String image, Collection<Hashtags> hashTags) {
        this.showTitle = showTitle;
        this.showRating = showRating;
        this.airDate = airDate;
        this.image = image;
        this.description = description;
        this.hashTags = hashTags;
    }

    public String getShowTitle() {
        return showTitle;
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

    public String getImage() {
        return image;
    }

    public Collection<Hashtags> getHashTags() {
        return hashTags;
    }
}