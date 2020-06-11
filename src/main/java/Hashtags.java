import java.util.Collection;

public class Hashtags {
    private Collection<Hashtags> hashtags;
    private String hashtagTitle;

    public Hashtags(Collection<Hashtags> hashtags, String hashtagTitle) {
        this.hashtags = hashtags;
        this.hashtagTitle = hashtagTitle;
    }

    public Collection<Hashtags> getHashtags() {
        return hashtags;
    }

    public String getHashtagTitle() {
        return hashtagTitle;
    }

}
