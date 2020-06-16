package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryStorage {

        Map<String, String> categories = new LinkedHashMap<>();

        public CategoryStorage(){
            categories.put("Adult Animation", "adultcategorynames");
            categories.put("Kids Cartoons", "kidscategorynames");
            categories.put("#hashtags", "hashtags");


        }

    public Map<String, String> getCategories() {
        return categories;
    }

}

