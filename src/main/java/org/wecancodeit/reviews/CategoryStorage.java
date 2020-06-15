package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryStorage {

//    private String categoryName;

        List<String> categoryNames;

        public CategoryStorage(){
            categoryNames = new ArrayList<>();
            categoryNames.add("Adult Animation");
            categoryNames.add("Kids Cartoons");
            categoryNames.add("#hashtags");
        }

        public List<String> findAllCategories() {
            return categoryNames;
        }

    }

