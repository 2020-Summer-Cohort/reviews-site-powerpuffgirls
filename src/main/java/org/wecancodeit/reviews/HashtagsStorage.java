package org.wecancodeit.reviews;

import java.util.ArrayList;
import java.util.List;

public class HashtagsStorage {

    private String hashtagName;

    public HashtagsStorage(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    List<String> hashtagNames;

    public HashtagsStorage(){
        hashtagNames = new ArrayList<>();
        hashtagNames.add("funny");
        hashtagNames.add("violent");
        hashtagNames.add("kids");
    }

    public List<String> findAllHashtags() {
        return hashtagNames;
    }

}