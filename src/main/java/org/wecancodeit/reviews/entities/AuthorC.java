package org.wecancodeit.reviews.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class AuthorC {

    @Id
    @GeneratedValue
    private long id;
    private String authorName;
    @OneToMany
//            (mappedBy = "blogposts")
    private Collection<BlogPosts> blogPosts;
    @ManyToOne
    private Categories categories;


    protected AuthorC() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public AuthorC(String authorName){
        this.authorName = authorName;

    }
    @Override
    public String toString() {
        return "authorName{" +
                "id=" + id +
                ", name='" + authorName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorC authorC = (AuthorC) o;

        if (id != authorC.id) return false;
        if (authorName != null ? !authorName.equals(authorC.authorName) : authorC.authorName != null) {
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        return result;
    }
}
