package org.wecancodeit.reviews;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowStorage {

    List<String> adultShowNames;
    List<String> kidsShowNames;

    public ShowStorage() {
        adultShowNames = new ArrayList<>();
        adultShowNames.add("Superjail");
        adultShowNames.add("Afro Samurai");

        kidsShowNames = new ArrayList<>();
        kidsShowNames.add("Powerpuff Girls");
        kidsShowNames.add("Steven Universe");

    }

    public List<String> findAllAdultAnimationShowNames() {
        return adultShowNames;
    }

    public List<String> findAllKidsShowNames() {
        return kidsShowNames;
    }

}

