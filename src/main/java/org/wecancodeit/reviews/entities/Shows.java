package org.wecancodeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Shows {

        @Id
        @GeneratedValue
        private long id;
        private String showTitle;
        @OneToMany
        private Collection<Reviews> reviews;
        @ManyToOne
        private Categories categories;

        protected Shows(){}

    public Shows(String showTitle, Categories categories) {
        this.showTitle = showTitle;
        this.categories = categories;

    }


    public long getId() {
        return id;
    }

    public String getShowTitle() {
        return showTitle;
    }

    public Categories getCategories() {
        return categories;
    }

    public Collection<Reviews> getReviews() {
        return reviews;
    }
}
