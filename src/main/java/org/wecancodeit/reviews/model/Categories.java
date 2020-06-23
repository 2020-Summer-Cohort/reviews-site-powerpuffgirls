package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;


    @Entity
    public class Categories {
        @Id
        @GeneratedValue
        private long id;
        private String name;
        @OneToMany(mappedBy = "categories")
        private Collection<Shows> shows;

        protected Categories() {
        }

        public Categories(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


        public long getId() {
            return id;
        }

        public Collection<Shows> getShows() {
            return shows;
        }

        @Override
        public String toString() {
            return "Categories{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Categories categories = (Categories) o;

            if (id != categories.id) return false;
            if (name != null ? !name.equals(categories.name) : categories.name != null) {
            } return false;
        }

        @Override
        public int hashCode() {
            int result = (int) (id ^ (id >>> 32));
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }
    }








