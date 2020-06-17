package org.wecancodeit.reviews;

import java.util.Collection;

public class Hashtags extends Reviews {
    private String hashtagName;

    public Hashtags(String hashtagName, String showTitle, Integer showRating, String airDate, String description, Collection<Hashtags>){
       super(showTitle, showRating, airDate, description, image ,hashtagName);
        this.hashtagName = hashtagName;
        this.showTitle = showTitle;
    }

}
