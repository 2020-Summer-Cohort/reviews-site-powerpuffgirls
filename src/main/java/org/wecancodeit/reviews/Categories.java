package org.wecancodeit.reviews;

import java.util.Collection;

public class Categories {

        private String adultAnimation;
        private String kidsShows;
        private String tags;

        public Categories(String adultAnimation, String kidsShows, String tags) {
            this.adultAnimation = adultAnimation;
            this.kidsShows = kidsShows;
            this.tags = tags;
        }
        public String getAdultAnimation() {
            return adultAnimation;
        }

        public String getKidsShows() {
            return kidsShows;
        }

        public String getTags() {
            return tags;
        }
    }
}

