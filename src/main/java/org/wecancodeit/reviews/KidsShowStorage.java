package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KidsShowStorage {


//    private String categoryName;

        List<String> showNames;

        public KidsShowStorage(){
            showNames = new ArrayList<>();
            showNames.add("Powerpuff Girls");
            showNames.add("Steven Universe");

        }

        public List<String> findAllKidsShowNames() {
            return showNames;
        }

    }

