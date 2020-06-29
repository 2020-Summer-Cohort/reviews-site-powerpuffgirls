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
//    @ManyToOne
//    private Categories categories;


    protected AuthorC() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Collection<BlogPosts> getBlogPosts() {
        return blogPosts;
    }

    public void setBlogPosts(Collection<BlogPosts> blogPosts) {
        this.blogPosts = blogPosts;
    }

    public AuthorC(String authorName){
        this.authorName = authorName;

    }
}
