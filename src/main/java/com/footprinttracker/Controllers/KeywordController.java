package com.footprinttracker.Controllers;

import com.footprinttracker.Entities.Keywords;
import com.footprinttracker.Services.KeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping("/keywords")
    public class KeywordController {

        @Autowired
        private KeywordService keywordService;

        @GetMapping
        public List<Keywords> getAllKeywords() {
            return keywordService.getAllKeywords();
        }

        @PostMapping
        public Keywords createKeyword(@RequestBody Keywords keyword) {
            return keywordService.createKeyword(keyword);
        }

}
