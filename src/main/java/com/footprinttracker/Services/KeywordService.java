package com.footprinttracker.Services;

import com.footprinttracker.Entities.Keywords;

import java.util.List;

public interface KeywordService {

    List<Keywords> getAllKeywords();
    Keywords createKeyword(Keywords keyword);
    // Add more methods for other operations

}
