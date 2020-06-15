package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
    public class HashtagsController {

    HashtagsStorage hashtagsStorage = new HashtagsStorage();

    public HashtagsController() {
    }

    @RequestMapping("hashtags")
    public String showAllHashtags(Model model){
        model.addAttribute("hashtagNames", hashtagsStorage.findAllHashtags());
        return "hashtags-template";
    }


}


